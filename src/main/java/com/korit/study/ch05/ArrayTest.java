package com.korit.study.ch05;

public class ArrayTest {
    public static void main(String[] args) {
        System.out.println("==========1===========");
        int[] arr1 = new int[]{10, 20, 30, 40, 50};
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("==========2==========");
        int[] arr2 = new int[]{5, 10, 15, 20, 25};
        int arr2_Total = 0;
        for (int i = 0; i < arr2.length; i++) {
//            arr2_Total = arr2_Total + arr2[i];
            arr2_Total += arr2[i];
        }
        System.out.println("배열 요소의 합 : " + arr2_Total);
        System.out.println("==========3==========");
        int[] arr3 = new int[] {23, 45, 12, 67, 34, 89, 11};
        int arr3_Max = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] > arr3_Max) {
                arr3_Max = arr3[i];
            }
        }
        System.out.println("배열의 최댓값 : " + arr3_Max);
        System.out.println("==========4==========");
        int[] arr4 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("짝수 : ");
        for (int i = 0; i < arr4.length; i++) {
            if(arr4[i] % 2 == 0) {
                System.out.print(arr4[i] + " ");
            }
        }
        System.out.println();
        System.out.println("==========5==========");
        int[] arr5 = new int[] {1, 2, 3, 4, 5,};
        for (int i = 0; i < arr5.length; i++) {
            int arr5_Reveres = arr5.length - 1;
            System.out.println(arr5[(arr5_Reveres - i)]);
        }
        System.out.println("==========6==========");
        int[] arr6 = new int[] {3, 7, 3, 9, 3, 1, 3, 5};
        int arr6_Count = 0;
        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] == 3) {
                arr6_Count++;
            }
        }
        System.out.println("3의 개수 : " + arr6_Count + "개");
        System.out.println("==========7==========");
        int[] arr7 = new int[] {80, 90, 75, 85, 95};
        int arr7_Total = 0;
        int arr7_Avg = 0;
        for (int i = 0; i < arr7.length; i++) {
            arr7_Total += arr7[i];
        }
        arr7_Avg = arr7_Total / arr7.length;
        System.out.println("배열의 평균 : " + arr7_Avg);
        System.out.println("==========8==========");
        int[] arr8_1 = new int[] {1, 2, 3, 4, 5};
        int[] arr8_2 = new int[] {6, 7, 8, 9, 10};
        int[] arr8_Sum = new int[arr8_2.length];
        System.out.print("합의 배열 : ");
        for (int i = 0; i < arr8_1.length; i++) {
            arr8_Sum[i] = arr8_1[i] + arr8_2[i];
            System.out.print(arr8_Sum[i] + " ");
        }
        System.out.println();
        System.out.println("==========9==========");
        int[] arr9 = new int[] {45, 23, 67, 12, 89, 34, 78};
        int arr9_Max = 0;
        int arr9_Min = 0;
        for (int i = 0; i < arr9.length; i++) {
            if (arr9_Max < arr9[i]) {
                arr9_Max = arr9[i];
            }
        }
        arr9_Min = arr9_Max;
        for (int i = 0; i < arr9.length; i++) {
            if (arr9_Min > arr9[i]) {
                arr9_Min = arr9[i];
            }
        }
        System.out.println("최솟값 : " + arr9_Min + " 최댓값 : " + arr9_Max);
        System.out.println("==========10==========");
        int[] arr10 = new int[] {85, 92, 78, 96, 88, 73, 99, 82};

        for (int i = 0; i < arr10.length; i++) {
            int arr10_StudentNum = 1;
            String arr10_gradePoint =
                    arr10[i] >= 90 ? "A" :
                            arr10[i] >= 80 ? "B" :
                                   arr10[i] >= 70 ? "C" : "D";

            System.out.println("학생 " + (arr10_StudentNum + i) + ": " + arr10[i] + "점 - " + arr10_gradePoint + "등급");
        }
    }
}
