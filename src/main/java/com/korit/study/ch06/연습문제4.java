package com.korit.study.ch06;

public class 연습문제4 {
    // 평균을 계산하는 함수 (정수 2개)
    public static double average(int score1, int score2) {
        // 구현하세요
        int total = score1 + score2;
        return total / 2.0;
    }

    // 평균을 계산하는 함수 (정수 3개) - 오버로딩
    public static double average(int score1, int score2, int score3) {
        // 구현하세요
        int total = score1 + score2 + score3;
        return total / 3.0;
    }

    // 등급을 반환하는 함수
    public static char getGrade(double average) {
        // 90이상: A, 80이상: B, 70이상: C, 그 외: F
        // 구현하세요
        return average >= 90 ? 'A' :
                average >= 80 ? 'B' :
                        average >= 70 ? 'C' : 'F';
    }

    // 학생 정보를 출력하는 함수
    public static void printStudentInfo(String name, int score1, int score2, int score3) {
        // average()와 getGrade() 함수를 호출하여 학생 정보를 출력하세요
        // 출력 형식: "홍길동 학생의 평균: 85.0, 등급: B"
        double avg = average(score1, score2, score3);
        char grade = getGrade(avg);
        System.out.println(name + " 학생의 평균 : " + avg + ", 등급 : " + grade);
    }

    public static void main(String[] args) {
        printStudentInfo("홍길동", 80, 85, 90);
        printStudentInfo("김철수", 95, 88, 92);
    }


}

