package com.kodilla.kodillajms.model;

import java.io.Serializable;

import static java.lang.String.format;

public class Order implements Serializable {
    private String identifier;
    private Double cost;

    public Order(String identifier, Double cost) {
        this.identifier = identifier;
        this.cost = cost;
    }

    public Order() {
    }

    public void displayOrder() {
        System.out.println(format("Identyfikator zamówienia: %s, koszt zamówienia: %s", identifier, cost));
    }

    public String getIdentifier() {
        return identifier;
    }

    public Double getCost() {
        return cost;
    }
}
