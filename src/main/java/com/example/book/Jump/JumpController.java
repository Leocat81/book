package com.example.book.Jump;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JumpController {
    @RequestMapping(value = "/hello",method = {RequestMethod.GET})
    public ModelAndView jumpIndex(ModelAndView mv){
            mv.setViewName("index");
            mv.addObject("name","pipe");
            return mv;
    }
}
