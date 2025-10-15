package com.korit.study.ch10;

public class ClassAMain {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.name = "김준일";
        a.age = 32;

        ClassB b = new ClassB("김준이", 33);
        System.out.println(b.name);
        ClassC c = new ClassC("정혁", 25, null);
        ClassC c2 = new ClassC("정혁");
    }
}
