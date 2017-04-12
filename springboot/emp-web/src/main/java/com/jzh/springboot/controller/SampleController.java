package com.jzh.springboot.controller;


import com.jzh.springboot.entity.Greeting;
import mx4j.tools.adaptor.http.HttpAdaptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by jzh on 2017/1/16.
 */
@RestController
public class SampleController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private HttpAdaptor httpAdaptor;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping("/hello")
    public String hello() {
        try {
            if(!httpAdaptor.isActive()) {
                httpAdaptor.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "hello";
    }
}
