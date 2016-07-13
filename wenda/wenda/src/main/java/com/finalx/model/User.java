package com.finalx.model;

/**
 * Created by tengyu on 2016/7/13.
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDescription(){
        return "hahah"+name;
    }
}
