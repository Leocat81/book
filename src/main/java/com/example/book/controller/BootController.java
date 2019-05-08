package com.example.book.controller;

import com.example.book.dao.UserDao;
import com.example.book.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value="/boot")
public class BootController {
    @Autowired
  private UserDao userDao;
    @RequestMapping(value ="getuser")
    public User getUser(){
        User u=new User();
        u.setName("pipe");
        return u;
    }
    @RequestMapping(value = "getAllUser")
    public List<User> getUsers()
    {
        List<User> userList= userDao.selectUser();
        return userList;
    }

}
