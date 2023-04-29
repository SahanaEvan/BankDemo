package com.example.demo;

public class LoanRequest {
    private String name;
    private String panNumber;
    private String contact;
    private double amount;

    public LoanRequest(String name, String panNumber, String contact, double amount) {
        this.name = name;
        this.panNumber = panNumber;
        this.contact = contact;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public String getContact() {
        return contact;
    }

    public double getAmount() {
        return amount;
    }
}