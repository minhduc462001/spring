package com.example.demo.demospringboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
    @RequestMapping(value = "/hello")
    public String home(HttpServletRequest request, Model model){
        String s = "hello ngo minh duc";
        request.setAttribute("hello",s);
        String s2 = "hahahaa";
        model.addAttribute("hi",s2);

        return "index";
    }
}
