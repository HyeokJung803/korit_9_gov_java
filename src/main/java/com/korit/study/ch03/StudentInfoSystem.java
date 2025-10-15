package com.korit.study.ch03;

import java.util.Scanner;

public class StudentInfoSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생 이름을 입력하세요: ");
        String name = scanner.next();
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();
        System.out.print("학년을 입력하세요: ");
        int grade = scanner.nextInt();
        System.out.print("국어 점수를 입력하세요: ");
        double korScore = scanner.nextInt();
        System.out.print("영어 점수를 입력하세요: ");
        double engScore = scanner.nextInt();
        System.out.print("수학 점수를 입력하세요: ");
        double mathScore = scanner.nextInt();
        double avg = (korScore + engScore + mathScore) / 3;
        String gradePoint = avg >= 95 ? "A+" :
                        avg >= 90 ? "A" :
                        avg >= 85 ? "B+" :
                        avg >= 80 ? "B" :
                        avg >= 75 ? "C+" :
                        avg >= 70 ? "C" :
                        avg >= 65 ? "D+" :
                        avg >= 60 ? "D" : "F";

        scanner.nextLine();
        System.out.print("자기소개를 입력하세요: ");
        String introduction = scanner.nextLine();
//        System.out.print("=== 학생 정보 ===\n" +
//                "이름:" + name + "\n" +
//                "나이: " + age + "세 (고등학교 " + grade + "학년)\n" +
//                "성적:\n" +
//                " 국어: " + korScore + "점\n" +
//                " 영어: " + engScore + "점\n" +
//                " 수학: " + mathScore + "점\n" +
//                " 평균: " + avg + " 학점 : " + gradePoint + "\n" +
//                " 자기소개: " + introduction);

        System.out.println("=== 학생 정보 ===");
        System.out.printf("""
                이름: %s
                나이: %s세 (고등학교 %s학년)" +
                성적:
                 국어: %.2f점
                 영어: %.2f점
                 수학: %.2f점
                 평균: %.2f점 (학점 %s)
                 자기소개: %s
                %n""", name, age, grade, korScore, engScore, mathScore, avg, gradePoint, introduction);


        // 여기에 코드를 작성하세요
        // next(), nextInt(), nextLine() 모두 사용

        scanner.close();
    }
}