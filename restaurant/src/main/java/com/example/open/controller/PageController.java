package com.example.open.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/page")
public class PageController {

    @GetMapping("/main")
    public ModelAndView main(){
        return new ModelAndView("view/main");
    }
}
