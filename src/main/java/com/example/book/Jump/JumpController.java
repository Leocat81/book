package com.example.book.Jump;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JumpController {
    @RequestMapping(value = "/login")
    public ModelAndView jumpIndex(ModelAndView mv){
            mv.setViewName("login");
            mv.addObject("name","pipe");
            return mv;
    }
}
