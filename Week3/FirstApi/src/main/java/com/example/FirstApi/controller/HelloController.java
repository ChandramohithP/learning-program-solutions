package com.example.FirstApi.controller;


import com.example.FirstApi.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloService service;
    //only get request is your work
    @GetMapping("/")
    public String greet()
    {
        return service.greet();
    }
    //@GetMapping("about")
    public String about(){
        return "me mohith";
    }

}
