package com.korit.study.ch23;

public class WrapperMain {
    public static void main(String[] args) {
        int num = 10;
        Integer num2 = 10; //autoBoxing
//        Integer num3 = new Integer(10);
        int num4 = num2; //autoUnBoxing
        String numstr = Integer.toString(num);
        String numstr2 = "" + num;
        String numstr3 = num2.toString();
        System.out.println(numstr + " " + numstr2 + " " + numstr3);
    }
}
