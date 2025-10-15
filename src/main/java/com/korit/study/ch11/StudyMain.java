package com.korit.study.ch11;

public class StudyMain {
    public static void main(String[] args) {
        // 과목명: JAVA 기초
        // 담당 선생님 이름: 김준일
        // 담당 선생님 나이: 32
        // 학생1 ID: 20250001
        // 학생1 이름: 박재현
        // 학생1 나이: 24
        // 학생2 ID: 20250002
        // 학생2 이름: 고대한
        // 학생2 나이: 19
        // 학생3 ID: 20250003
        // 학생3 이름: 양재원
        // 학생3 나이: 27
        // 스터디 객체를 생성하시오
        Student student1 = new Student(2025001, "박재현", 24);
        Student student2 = new Student(2025002, "고대한", 19);
        Student student3 = new Student(2025003, "양재원", 27);
        Student[] students = new Student[]{student1, student2, student3};
        Teacher teacher1 = new Teacher("김준일", 32);
        Subject subject1 = new Subject("Java 기초", teacher1);
        Study study1 = new Study(subject1, students);

        StudyPrintService studyPrintService = new StudyPrintService();
        studyPrintService.printInfoAll(study1);
        System.out.println("=========================================");
        studyPrintService.printInfoSubject(study1.subject);
        System.out.println("=========================================");
        studyPrintService.printInfoTeacher(study1.subject.teacher);
        System.out.println("=========================================");
        studyPrintService.printInfoStudent(study1.students[0]);
        System.out.println("=========================================");
        studyPrintService.printInfoStudents(study1.students);
    }
}