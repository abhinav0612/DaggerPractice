package com.example.daggerpractice;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Abhinav Singh on 02,June,2020
 */
public class User {
    private String name;
    private Integer id;

    @Inject
    public User(@Named("userName") String name,@Named("userId") Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
