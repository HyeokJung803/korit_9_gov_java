package com.korit.study.ch05;

public class ArrayTest05 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 3, 1, 3, 3};
        int[] arr1 = new int[0]; // 1들만 모으기
        int[] arr2 = new int[0]; // 2들만 모으기
        int[] arr3 = new int[0]; // 3들만 모으기

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                int[] temp = new int[arr1.length + 1];
                for (int j = 0; j < arr1.length; j++) {
                    temp[j] = arr1[j];
                }
                arr1 = temp;
                arr1[arr1.length - 1] = nums[i];
            } else if (nums[i] == 2){
                int[] temp = new int[arr2.length + 1];
                for (int j = 0; j < arr2.length; j++) {
                    temp[j] = arr2[j];
                }
                arr2 = temp;
                arr2[arr2.length - 1] = nums[i];
            } else if (nums[i] == 3){
                int[] temp = new int[arr3.length + 1];
                for (int j = 0; j < arr3.length; j++) {
                    temp[j] = arr3[j];
                }
                arr3 = temp;
                arr3[arr3.length - 1] = nums[i];
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();


    }
}
