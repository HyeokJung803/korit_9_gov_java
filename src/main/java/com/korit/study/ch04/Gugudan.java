package com.korit.study.ch04;

import java.util.Scanner;

public class Gugudan{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startDan = scanner.nextInt();
        int endDan = scanner.nextInt();

        int danRange = endDan - startDan + 1;

        // 여기에 코드를 작성하세요
        // 입력 순서와 Scanner 메서드 조합에 주의
        for (int i = 0; i < danRange; i++) {
            int n1 = endDan - i;
            System.out.println(n1 + "단");
            for (int j = 0; j < 9; j++) {
                int n2 = 9 - j;
                System.out.println(n1 + " X " + n2 + " = " + n1 * n2);
            }
        }

        scanner.close();
    }
}