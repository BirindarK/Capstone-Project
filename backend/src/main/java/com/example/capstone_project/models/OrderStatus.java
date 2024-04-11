package com.example.capstone_project.models;

public enum OrderStatus {

    PENDING("Pending"),
    IN_PROGRESS("In Progress"),
    OUT_FOR_DELIVERY("Out for delivery"),
    DELIVERED("Delivered");

    final String displayStatus;

    OrderStatus(String displayStatus) {
        this.displayStatus = displayStatus;
    }

}
