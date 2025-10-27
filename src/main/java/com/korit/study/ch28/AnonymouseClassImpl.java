package com.korit.study.ch28;

public class AnonymouseClassImpl implements  AnonymousClass{
    @Override
    public void fx1() {
        System.out.println("fx1 호출");
    }

    @Override
    public int fx2() {
        return 10;
    }
}
