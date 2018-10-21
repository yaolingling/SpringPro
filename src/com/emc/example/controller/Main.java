package com.emc.example.controller;

import com.emc.example.dao.User;
import com.emc.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("conf/test.xml");
        /*AccountService accountService = (AccountService) context.getBean("accountService");
        accountService.doSomething();

        Account account = (Account)context.getBean("account");
        Map<Integer, String> map = account.getBooks();
        for(Map.Entry<Integer, String> one : map.entrySet()){
            System.out.println(one.getKey() + " " + one.getValue());
        }

        User user = (User)context.getBean("user");
        System.out.println(user.toString());*/

        /*UserService userService = (UserService) context.getBean("userService");
        userService.done();*/

        User user = (User) context.getBean("user");
        User user2 = (User) context.getBean("user");
        System.out.println(user);
        System.out.println(user2);
    }
}
