package com.korit.study.ch05;

public class ArrayTest04 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] evens = new int[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                int[] temp = new int[evens.length + 1];
                for (int j = 0; j < evens.length; j++) {
                    temp[j] = evens[j];
                }
                evens = temp;
                evens[evens.length - 1] = nums[i];
            }
        }
        for (int i = 0; i < evens.length; i++) {
            System.out.println(evens[i]);
        }
    }
}
