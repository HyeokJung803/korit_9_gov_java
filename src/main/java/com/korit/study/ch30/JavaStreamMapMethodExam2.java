package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;

class Item {
    private String name;
    private int price;
    // constructor, getters


    public Item(String name, int price) {
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

class Student {
    String name;
    int score;
    // constructor, getters

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

public class JavaStreamMapMethodExam2 {
    public static void main(String[] args) {
        // 문제 1: 문자열 첫 글자 추출
        // 각 도시명의 첫 글자만 추출하여 문자 리스트를 생성하세요.
        // 예상 출력:[S, B, I, D, G]
        List<String> cities = Arrays.asList("Seoul", "Busan", "Incheon", "Daegu", "Gwangju");
        List<String> firstChar = cities.stream().map(
                getFirst -> String.valueOf(getFirst.charAt(0))
        ).toList();
        System.out.println(firstChar);

        // 문제 2: 불린 값 반전
        // 각 불린 값을 반대로 변환하세요. 예상 출력: [false, true, false, false, true]
        List<Boolean> flags = Arrays.asList(true, false, true, true, false);
        List<Boolean> reverseFlags = flags.stream().map(
                reverse -> !(reverse)
        ).toList();
        System.out.println(reverseFlags);

        // 문제 3: 온도 단위 변환 (섭씨 → 화씨)
        // 섭씨 온도를 화씨로 변환하세요. 공식:(C × 9/5) + 32
        // 예상 출력:[32.0, 77.0, 212.0, 14.0]
        List<Double> celsius = Arrays.asList(0.0, 25.0, 100.0, -10.0);
        List<Double> fahrenheit = celsius.stream()
                .map(tofah -> (tofah * 1.8) + 32)
                .toList();
        System.out.println(fahrenheit);

        // 문제 4: 문자열 앞뒤 공백 제거
        // 각 문자열의 앞뒤 공백을 제거하세요.
        // 예상 출력:[hello, world, java, stream]
        List<String> messyData = Arrays.asList("  hello  ", "world   ", "  java", "   stream   ");
        List<String> trimMessydata = messyData.stream()
                .map(String::trim)
        .toList();
        System.out.println(trimMessydata);

        // 문제 5: 이메일 도메인 추출
        // 각 이메일 주소에서 도메인 부분만 추출하세요. (@ 이후 부분)
        // 예상 출력:[gmail.com, company.co.kr, naver.com, daum.net]
        List<String> emails = Arrays.asList(
                "user1@gmail.com",
                "admin@company.co.kr",
                "support@naver.com",
                "info@daum.net"
        );
        List<String> getDomain = emails.stream()
                .map(domain -> domain.substring(domain.indexOf("@") +1))
        .toList();
        System.out.println(getDomain);

        // 문제 6: 나이를 출생연도로 변환
        // 각 나이를 출생연도로 변환하세요.
        // 예상 출력:[1999, 1994, 1989, 2004, 1979]
        List<Integer> ages = Arrays.asList(25, 30, 35, 20, 45);
        int currentYear = 2024;
        List<Integer> bornAges = ages.stream()
                .map(bornAge -> currentYear - bornAge )
                .toList();
        System.out.println(bornAges);

        // 문제 7: 상품명과 가격 결합
        // 각 Item을 "상품명(가격원)" 형식의 문자열로 변환하세요.
        // 예상 출력: [사과(3000원), 바나나(2000원), 오렌지(5000원)]

        List<Item> items = Arrays.asList(
                new Item("사과", 3000),
                new Item("바나나", 2000),
                new Item("오렌지", 5000)
        );
        List<String> itemsToString = items.stream()
                .map(item -> String.format("%s(%d원)", item.getName(), item.getPrice()))
                .toList();
        System.out.println(itemsToString);

        // 문제 8: 학생 성적 등급 변환
        // 각 학생을 "{이름}: {등급}" 형식으로 변환하세요. 등급 기준: 90이상 A, 80이상 B, 70이상 C, 그 외 D
        // 예상 출력: [김철수: A, 이영희: B, 박민수: C, 정지원: D]
        List<Student> students = Arrays.asList(
                new Student("김철수", 95),
                new Student("이영희", 82),
                new Student("박민수", 76),
                new Student("정지원", 68)
        );
        List<String> studentGrand = students.stream()
                .map(getGrand -> getGrand.getName()+ ": " + ((getGrand.getScore() > 90) ? "A" :
                        (getGrand.getScore() > 80) ? "B" :
                        (getGrand.getScore() > 70) ? "C" : "D"))
                .toList();
        System.out.println(studentGrand);

        // 문제 9: 파일 경로에서 파일명 추출
        // 각 파일 경로에서 파일명만 추출하세요. (경로 구분자는 / 또는 \)
        // [report.pdf, system.log, image.jpg, music.mp3]
        List<String> filePaths = Arrays.asList(
                "/home/user/documents/report.pdf",
                "/var/log/system.log",
                "C:\\Users\\Admin\\Desktop\\image.jpg",
                "/downloads/music.mp3"
        );
        List<String> findByFilePaths = filePaths.stream()
                .map(find -> find.substring(find.lastIndexOf("/") + 1)
                        .substring(find.lastIndexOf("\\") +1))
                .toList();
        System.out.println(findByFilePaths);

        // 문제 10: 전화번호 포맷팅
        // 각 전화번호를 "010-XXXX-XXXX" 형식으로 변환하세요.
        // 예상 출력: [010-1234-5678, 010-9876-5432, 010-5555-6666, 010-1111-2222]
        List<String> phoneNumbers = Arrays.asList(
                "01012345678",
                "01098765432",
                "01055556666",
                "01011112222"
        );
//        List<String> typePhoneNumber = phoneNumbers.stream()
//                .map(gettype -> gettype.replaceAll())
//                .toList();


    }
}
