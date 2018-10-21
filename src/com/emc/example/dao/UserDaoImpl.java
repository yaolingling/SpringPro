package com.emc.example.dao;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao{

    public void done() {
        System.out.println("UserDaoImpl#done");
    }
}






