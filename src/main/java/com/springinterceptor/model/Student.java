package com.springinterceptor.model;

public record Student(String name, String address) {
    public Student(String name) {
        this(name, null);
    }
}
