package com.korit.study.ch22.dto;

import java.sql.SQLOutput;

class Entity {
    private String name;

    public void call() {
        Entity t = new Entity();
        t.name = "김준일";
        System.out.println(t.name);
    }

    public void thisCall() {
        System.out.println(name);
    }
}

public class Test {
    public static void main(String[] args) {
        Entity e = new Entity();
        e.call();
        e.thisCall();
    }

}


