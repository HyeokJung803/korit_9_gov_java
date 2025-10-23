package com.korit.study.ch24;

public class Writer {
    String name;
    int age;

    public Writer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Writer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "이름 : " + name + " 나이 : " + age;
    }
}
