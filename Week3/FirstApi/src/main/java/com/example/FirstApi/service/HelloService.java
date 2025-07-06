package com.example.FirstApi.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService
{
    public String greet()
    {
        //process business logic is ypur work
        return "hello world from service";
    }
}
