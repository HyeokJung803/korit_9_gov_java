package com.korit.study.ch08;

public class Array03 {
    static void main() {
        int[] nums = {15, 23, 7, 30, 4, 18};
        int 탐색횟수 = 0;
        int 찾은인덱스 = 0;
        int findNum = 30;

        // 30을 찾기 위한 탐색 시도가 몇번 있었는지 30의 인엑스 위치를 출력하시오.
        for (int i = 0; i < nums.length; i++) {
//            탐색횟수 = i + 1;
            탐색횟수++;
            찾은인덱스 = i;
            if (nums[i] == findNum) {
                System.out.println(findNum + " 확인");
                System.out.println("탐색횟수 : " + 탐색횟수);
                System.out.println("찾은인덱스 : " + 찾은인덱스);
                break;
            }
        }
        System.out.println(nums[nums.length / 2 - 1]);
    }
}
