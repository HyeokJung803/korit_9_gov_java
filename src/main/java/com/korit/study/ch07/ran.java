package com.korit.study.ch07;

import java.util.Random;

public class ran {
    static void main() {
        Random random = new Random();
        int[] a = new int[6];
          for (int i = 0; i < 6; i++) {
            a[i] = random.nextInt(46);
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(a[i]);
        }
    }
}
