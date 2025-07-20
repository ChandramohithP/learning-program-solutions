package com.example.loanservice.model;

public record Loan(String number, String type, double loanAmount, double emi, int tenureMonths) {}
