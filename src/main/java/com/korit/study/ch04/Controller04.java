package com.korit.study.ch04;

public class Controller04 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

        }

        for (int i = 3; i < 100; i++) {
            if(i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");

        for(int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i+1 + "는 홀수입니다.");
            } else {
                System.out.println(i+1 + "는 짝수입니다.");
            }
        }



//        int i = 0;
//        while (i < 5) {
//            i++;
//        }
    }
}
