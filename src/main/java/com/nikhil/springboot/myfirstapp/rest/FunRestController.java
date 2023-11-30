package com.nikhil.springboot.myfirstapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    // exposing endpoint
    @RestController
    public class FunRestController{
        @GetMapping("/")
        public String sayHello(){
            return "hello world!";
        }
    }

