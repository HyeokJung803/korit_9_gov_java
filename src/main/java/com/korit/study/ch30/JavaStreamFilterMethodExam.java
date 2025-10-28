package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;

class Product {
    String name;
    int price;
    // constructor, getters

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

class Person1 {
    String name;
    int age;
    // constructor, getters

    public Person1(String name, int age) {
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

class Student1 {
    private String name;
    private int mathScore;
    private int englishScore;
    // constructor, getters

    public Student1(String name, int mathScore, int englishScore) {
        this.name = name;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
    }

    public String getName() {
        return name;
    }

    public int getMathScore() {
        return mathScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }
}

class Item1 {
    String name;
    int stock;
    boolean onSale;
    int price;
    // constructor, getters

    public Item1(String name, int stock, boolean onSale, int price) {
        this.name = name;
        this.stock = stock;
        this.onSale = onSale;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public int getPrice() {
        return price;
    }
}


public class JavaStreamFilterMethodExam {
    public static void main(String[] args) {
        // 문제 1: 짝수만 필터링
        // 짝수만 필터링하여 새로운 리스트를 생성하세요.
        // 예상 출력: [2, 4, 6, 8, 10]
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream().filter(integer -> integer % 2 ==0).toList();
        System.out.println(evenNumbers);

        // 문제 2: 특정 길이 이상인 문자열 필터링
        // 길이가 5 이상인 단어만 필터링하세요.
        // 예상 출력: [elephant, butterfly, tiger]
        List<String> words = Arrays.asList("cat", "elephant", "dog", "butterfly", "ant", "tiger");
        List<String> wordsLengthOver5 = words.stream()
                .filter(word -> word.length() >= 5)
                .toList();
        System.out.println(wordsLengthOver5);

        // 문제 3: 특정 문자로 시작하는 이름 필터링
        // 'A'로 시작하는 이름만 필터링하세요.
        // 예상 출력: [Alice, Anna, Andrew]
        List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Charlie", "Andrew", "David");
        List<String> StartANames = names.stream()
                .filter(name -> name.startsWith("A"))
                .toList();
        System.out.println(StartANames);

        // 문제 4: 음수 제거
        // 양수(0 포함)만 필터링하세요.
        // 예상 출력: [3, 8, 0, 7, 4]
        List<Integer> mixedNumbers = Arrays.asList(-5, 3, -2, 8, -1, 0, 7, -9, 4);
        List<Integer> positiveNums = mixedNumbers.stream()
                .filter(integer -> integer >= 0)
                .toList();
        System.out.println(positiveNums);

        // 문제 5: 가격 범위로 상품 필터링
        // 가격이 50,000원 이상 500,000원 이하인 상품만 필터링하세요.
        // 예상 출력:[키보드, 모니터]
        List<Product> products = Arrays.asList(
                new Product("노트북", 1500000),
                new Product("마우스", 30000),
                new Product("키보드", 80000),
                new Product("모니터", 300000),
                new Product("USB", 15000)
        );
        List<String> filterProducts = products.stream()
                .filter(filterPrice -> filterPrice.getPrice() >= 50000
                && filterPrice.getPrice() <= 500000)
                .map(Product::getName)
                .toList();
        System.out.println(filterProducts);

        // 문제 6: 이메일 도메인으로 필터링
        // Gmail 계정(@gmail.com)만 필터링하세요.
        // 예상 출력: [user1@gmail.com, support@gmail.com, hello@gmail.com]
        List<String> emails = Arrays.asList(
                "user1@gmail.com",
                "admin@company.com",
                "support@gmail.com",
                "info@naver.com",
                "hello@gmail.com",
                "test@daum.net"
        );

        List<String> findGamil = emails.stream()
                .filter(email -> email.contains("@gmail.com"))
                .toList();
        System.out.println(findGamil);

        // 문제 7: 성인만 필터링
        // 나이가 19세 이상인 성인만 필터링하세요.
        // 예상 출력: [김철수(25), 박민수(30), 최수현(22)]
        List<Person1> people = Arrays.asList(
                new Person1("김철수", 25),
                new Person1("이영희", 17),
                new Person1("박민수", 30),
                new Person1("정지원", 16),
                new Person1("최수현", 22)
        );
        List<String> adultPeople = people.stream()
                .filter(findAdult -> findAdult.getAge() >= 19)
                .map(findAdult -> findAdult.getName() + "(" + findAdult.getAge() + ")")
                .toList();
        System.out.println(adultPeople);

        // 문제 8: 합격자 필터링
        // 수학과 영어 점수가 모두 80점 이상인 학생만 필터링하세요.
        // 예상 출력: [김철수, 이영희, 최수현]
        List<Student1> students = Arrays.asList(
                new Student1("김철수", 85, 90),
                new Student1("이영희", 92, 88),
                new Student1("박민수", 65, 70),
                new Student1("정지원", 78, 85),
                new Student1("최수현", 95, 92)
        );
        List<String> geniusStudents = students.stream()
                .filter(findStudent -> findStudent.getMathScore() >= 80 &&
                        findStudent.getEnglishScore() >= 80)
                .map(Student1::getName)
                .toList();
        System.out.println(geniusStudents);

        // 문제 9: 특정 키워드 포함 여부로 필터링
        // 제목에 "Java"가 포함된 글만 필터링하세요. (대소문자 구분)
        // 예상 출력: [Java 프로그래밍 기초, Java Stream API 완벽 가이드, Java Spring Boot 실전]
        List<String> articles = Arrays.asList(
                "Java 프로그래밍 기초",
                "Python으로 배우는 머신러닝",
                "Java Stream API 완벽 가이드",
                "JavaScript 최신 기능",
                "Java Spring Boot 실전",
                "React 입문 강좌"
        );
        List<String> findWord = articles.stream()
                .filter(findJavaWord -> findJavaWord.contains("Java"))
                .toList();
        System.out.println(findWord);

        // 문제 10: 재고가 있고 할인 중인 상품 필터링
        // 재고가 1개 이상 있고(stock > 0), 할인 중인(onSale = true) 상품만 필터링하세요.
        // 예상 출력: [노트북, 헤드셋]
        List<Item1> items = Arrays.asList(
                new Item1("노트북", 5, true, 1000000),
                new Item1("마우스", 0, true, 30000),
                new Item1("키보드", 10, false, 50000),
                new Item1("헤드셋", 3, true, 80000),
                new Item1("웹캠", 0, false, 60000)
        );
        List<String> filterItem = items.stream()
                .filter(findItem -> findItem.getStock() >= 1 &&
                        findItem.isOnSale())
                .map(Item1::getName)
                .toList();
        System.out.println(filterItem);

        //
    }
}
