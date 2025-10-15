package com.korit.study.ch10;

public class ClassEMain {
    public static void main(String[] args) {
        ClassE classE = new ClassE("김준열", 32, "동래구");
        System.out.println("classE.name = " + classE.name);
        System.out.println(classE.toString());
    }
}
