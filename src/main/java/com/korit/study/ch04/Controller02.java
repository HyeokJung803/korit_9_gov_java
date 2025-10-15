package com.korit.study.ch04;

import java.util.Scanner;

public class Controller02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("나머지");
        }
    }
}
