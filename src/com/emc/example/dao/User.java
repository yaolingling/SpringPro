package com.emc.example.dao;

import lombok.*;

public class User {
    @Setter
    private String name;
    @Setter
    private int age;

    public User(){

    }

    public User(String name, int age){
        System.out.println("User1");
        this.name = name;
        this.age = age;
    }

    public User(int age, String name){
        System.out.println("User2");
        this.age = age;
        this.name = name;
    }
}
