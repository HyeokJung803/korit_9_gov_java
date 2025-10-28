package com.korit.study.ch30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person {
    private String name;
    private int age;
    // constructor, getters


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class User{
    private static String username;

    public User(String username) {
        this.username = username;
    }

    public static String getUsername() {
        return username;
    }
}

class Employee {
    private String name;
    private double salary;
    // constructor, getters

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public EmployeeDTO toDto() {
        return new EmployeeDTO(String.format("Mr./Ms. %s", name), String.format("$%f", salary));
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class EmployeeDTO {
    private String displayName;
    private String salaryInfo;
    // constructor, getters

    public EmployeeDTO(String displayName, String salaryInfo) {
        this.displayName = displayName;
        this.salaryInfo = salaryInfo;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "displayName='" + displayName + '\'' +
                ", salaryInfo='" + salaryInfo + '\'' +
                '}';
    }
}

public class JavaStreamMapMethodExam {
    public static void main(String[] args) {
        // 문제 1: 문자열 대문자 변환
        // 모든 이름을 대문자로 변환하여 새로운 리스트를 생성하세요. 예상 출력: [ALICE, BOB, CHARLIE, DAVID]
        List<String> names = Arrays.asList("alice", "bob", "charlie", "david");
        List<String> upperCasenames =
                names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("1번 문제");
        System.out.println(upperCasenames);

        // 문제 2: 숫자 제곱 계산
        // 각 숫자의 제곱을 계산하여 새로운 리스트를 생성하세요. 예상 출력: [1, 4, 9, 16, 25]
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> powNumbers =
                numbers.stream().map(number -> Math.pow(number, 2.0))
                .collect(Collectors.toList());
        System.out.println("2번 문제");
        System.out.println(powNumbers);


        // 문제 3: 문자열 길이 추출
        // 각 단어의 길이를 추출하여 정수 리스트를 생성하세요. 예상 출력: [4, 6, 3, 11]
        List<String> words = Arrays.asList("Java", "Stream", "API", "Programming");
        List<Integer> wordsLength = words.stream()
                        .map(word -> word.length())
                .collect(Collectors.toList());
        System.out.println("3번 문제");
        System.out.println(wordsLength);


        // 문제 4: 가격에 세금 추가
        // 각 가격에 10% 세금을 추가한 최종 가격 리스트를 생성하세요. 예상 출력:[110.0, 220.0, 165.0, 330.0]
        List<Double> prices = Arrays.asList(100.0, 200.0, 150.0, 300.0);
        List<Double> taxPrices =
                prices.stream()
                        .map(price -> price + price * 0.1)
                        .collect(Collectors.toList());
        System.out.println("4번 문제");
        System.out.println(taxPrices);

        // 문제 5: 객체에서 특정 필드 추출
        // Person 객체 리스트에서 이름만 추출하여 문자열 리스트를 생성하세요.
        // 예상 출력: [Alice, Bob, Charlie]
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );
        List<String> userName =
                people.stream().map(Person::getName)
                        .collect(Collectors.toList());
        System.out.println("5번 문제");
        System.out.println(userName);

        // 문제 6: 문자열 포맷팅
        // 각 사용자명을 "User: {username}" 형식으로 변환하세요.
        // 예상 출력:[User: john, User: mary, User: steve]
        List<String> usernames = Arrays.asList("john", "mary", "steve");
        List<String> users = usernames.stream().map(toUser -> "User: " + toUser.trim()).
                collect(Collectors.toList());
        System.out.println("6번 문제");
        System.out.println(users);


        // 문제 7: 여러 필드를 조합한 새 객체 생성
        // Employee를 EmployeeDTO로 변환하세요.
        // displayName은 "Mr./Ms. {name}", salaryInfo는 "Salary: ${salary}"
        // 예상 출력: [EmployeeDTO(Mr./Ms. Kim, Salary: $50000.0), ...]
        List<Employee> employees = Arrays.asList(
                new Employee("Kim", 50000),
                new Employee("Lee", 60000)
        );

        List<EmployeeDTO> employeeDTOs = employees.stream()
                .map(Employee::toDto)
                .toList();
        System.out.println(employees);;
        System.out.println(employeeDTOs);
    }
}
