package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
public class CountryController {
    @GetMapping("/countries")
    public List<Map<String, String>> getCountries() {
        List<Map<String, String>> countries = new ArrayList<>();
        Map<String, String> us = new HashMap<>();
        us.put("code", "US");
        us.put("name", "United States");
        Map<String, String> in = new HashMap<>();
        in.put("code", "IN");
        in.put("name", "India");
        Map<String, String> jp = new HashMap<>();
        jp.put("code", "JP");
        jp.put("name", "Japan");
        countries.add(us);
        countries.add(in);
        countries.add(jp);
        return countries;
    }
}