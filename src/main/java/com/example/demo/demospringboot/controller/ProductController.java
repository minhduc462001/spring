package com.example.demo.demospringboot.controller;

import com.example.demo.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {
    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public String setProduct(Model model){
        Product product = new Product(1,"haha",20,5,"img",6);
        model.addAttribute("p",product);

        return "product";
    }


}
