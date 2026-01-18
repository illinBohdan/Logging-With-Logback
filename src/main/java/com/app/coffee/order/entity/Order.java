package com.app.coffee.order.entity;

public class Order {

    int numberOfOrder;
    String name;

    public Order(int numberOfOrder, String name) {
        this.numberOfOrder = numberOfOrder;
        this.name = name;
    }

    public int getNumberOfOrder() {
        return numberOfOrder;
    }

    public void setNumberOfOrder(int numberOfOrder) {
        this.numberOfOrder = numberOfOrder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Замовлення №" + numberOfOrder +
                ", ім'я замовника: " + name ;
    }
}
