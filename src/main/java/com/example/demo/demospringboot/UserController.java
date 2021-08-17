package com.example.demo.demospringboot;

import com.example.demo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired

    @GetMapping(path = "/")
    public ResponseEntity<List<Product>> getAllProduct(){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
