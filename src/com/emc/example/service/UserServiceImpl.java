package com.emc.example.service;

import com.emc.example.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    //占位符方式
    @Value("${jdbc.url}")
    private String url;

    //SpEL表达方式，其中代表xml配置文件中的id值configProperties
    @Value("#{configProperties['jdbc.username']}")
    private String userName;

    public void done() {
        System.out.println("url = " + url);
        System.out.println("userName = " + userName);
        userDao.done();
    }
}
