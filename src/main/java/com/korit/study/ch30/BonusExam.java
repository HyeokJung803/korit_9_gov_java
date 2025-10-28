package com.korit.study.ch30;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BonusExam {
    public static void main(String[] args) {
        // 보너스 1: null이 아닌 값만 필터링
        // null이 아니고 빈 문자열도 아닌 값만 필터링하세요.
        // 예상 출력: [apple, banana, cherry];
        List<String> data = Arrays.asList("apple", null, "banana", "", null, "cherry", "");
        List<String> notNullData = data.stream()
                .filter(s -> s != null && !s.isEmpty())
                .toList();
        System.out.println(notNullData);

        // 보너스 2: 중복되지 않은 숫자 필터링
        // 리스트에서 한 번만 등장하는 숫자만 필터링하세요.
        // 예상 출력: [1, 4, 6, 7, 8] 힌트:Collections.frequency() 활용
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 7, 5, 8);
        List<Integer> notDuplicateNumber = numbers.stream()
                .filter(n -> Collections.frequency(numbers, n) == 1)
                .toList();
        System.out.println(notDuplicateNumber);

        // 보너스 3: 주말 날짜만 필터링
        // 토요일과 일요일만 필터링하세요. 예상 출력:
        // 예상 출력: [2024-01-06, 2024-01-07, 2024-01-13, 2024-01-14] 힌트: getDayOfWeek() 활용
        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(2024, 1, 1),  // 월요일
                LocalDate.of(2024, 1, 6),  // 토요일
                LocalDate.of(2024, 1, 7),  // 일요일
                LocalDate.of(2024, 1, 10), // 수요일
                LocalDate.of(2024, 1, 13), // 토요일
                LocalDate.of(2024, 1, 14)  // 일요일
        );
        List<LocalDate> findStuSun = dates.stream()
                .filter(d -> d.getDayOfWeek() == DayOfWeek.SUNDAY || d.getDayOfWeek() == DayOfWeek.SATURDAY)
                .toList();
        System.out.println(findStuSun);
    }
}
