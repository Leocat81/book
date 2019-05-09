package com.example.book.controller;

import com.example.book.dao.UserDao;
import com.example.book.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value="/boot")
public class BootController {
    @Autowired
  private UserDao userDao;
    @RequestMapping(value ="hello", method = RequestMethod.GET)
    public String get(Model model){
        model.addAttribute("name", "hahahahah");
        model.addAttribute("currentDate", new Date());
     return "index";
    }
    @RequestMapping(value = "getAllUser")
    public List<User> getUsers()
    {
        List<User> userList= userDao.selectUser();
        return userList;
    }

}
