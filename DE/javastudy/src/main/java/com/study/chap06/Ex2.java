package com.study.chap06;

/* 6-2. SutdaCard 클래스에 두 개의 생성자와 info()를 추가해서 실행결과와 같은 결과를 얻도록 하시오 */
public class Ex2 {
    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();

        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}

// 3
// 1K