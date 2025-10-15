package com.korit.study.ch04;

public class Controller06 {
    public static void main(String[] args) {
        //중첩반복
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
            for (int j = 0; j < i; j++) {
                System.out.println("j = " + j);
            }
        }
        /*구구단*/
        for (int i = 0; i < 9; i++) {
            int n1 = i + 1;
            for (int j = 0; j < 9; j++) {
                int n2 = j + 1;
                System.out.printf(n1 + " * " + n2 + " = " + n1*n2 + " ");
            }
            System.out.println(" ");
        }

    }
}
