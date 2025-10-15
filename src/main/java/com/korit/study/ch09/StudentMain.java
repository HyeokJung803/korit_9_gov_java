package com.korit.study.ch09;

class Student {
    String name;
    int age;
    boolean gender;
    void printInfo() {
        System.out.println("학생 정보 출력");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("성별: " + (gender ? "남" : "여"));
        System.out.println("==========================");
    }

}

public class StudentMain {
    // 2명의 학생정보를 객체를 사용하여 정의하고 출력하는 프로그램을 만드시오.
    /*
    이름: 김준일
    나이: 32
    성별: 남(true)

    이름: 김준이
    나이: 33
    성별: 여(false)
     */
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "김준일";
        s1.age = 32;
        s1.gender = true;

        Student s2 = new Student();
        s2.name = "김준이";
        s2.age = 33;
        s2.gender = false;

        s1.printInfo();
        s2.printInfo();

    }
}
