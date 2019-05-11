package com.example.book.controller;

import com.example.book.dao.UserDao;
import com.example.book.entity.User;
import com.example.book.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
@EnableAutoConfiguration
@RequestMapping(value="/boot")
public class BootController {
    @Autowired
    private LoginService loginService;
    @RequestMapping(value ="login")
    public ModelAndView login(User user){
          int a=loginService.login();
        ModelAndView mv =new ModelAndView();
          if(a==1){

              mv.setViewName("index");
              mv.addObject(user);
              return mv;
          }else {
             mv.setViewName("loginerror");

              return mv;
          }
    }

/*    @RequestMapping(value = "getAllUser")
    public List<User> getUsers()
    {
        List<User> userList= userDao.selectUser();
        return userList;
    }*/

}
