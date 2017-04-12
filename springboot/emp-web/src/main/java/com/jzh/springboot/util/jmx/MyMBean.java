package com.jzh.springboot.util.jmx;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;

/**
 * Created by jzh on 2017/4/5.
 */
@ManagedResource
public class MyMBean {

    private String name;

    @ManagedAttribute
    public String getName() {
        return name;
    }

    @ManagedAttribute
    public void setName(String name) {
        this.name = name;
    }
}
