package com.example.accountservice.controller;

import com.example.accountservice.model.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/accounts/{number}")
    public Account getAccount(@PathVariable String number)
    {
        return new Account(number, "savings", 234343.00);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Account Service!";
    }
}
