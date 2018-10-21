package com.emc.example.dao;

import lombok.Data;

import java.util.List;
import java.util.Set;
import java.util.*;

@Data
public class Account {
    private String name;
    private String pwd;
    private List<String> citys;
    private Set<String> friends;
    private Map<Integer,String> books;

}
