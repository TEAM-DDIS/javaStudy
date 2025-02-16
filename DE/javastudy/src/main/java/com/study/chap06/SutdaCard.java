package com.study.chap06;

/* 6-1. SutdaCard 클래스를 정의하시오 */
public class SutdaCard {
    private int num;
    private boolean isKwang;

    public SutdaCard() {
        this.num = 1;
        this.isKwang = true;
    }

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }


    public String info() {
        return this.num + ((this.isKwang) ? "K" : "");
    }
}
