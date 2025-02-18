package com.study.chap07;

/* 7-1. 섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스) 정의 */
/* SutdaCard 배열 초기화
 * 1~10까지의 숫자
 * 1, 3, 8인 경우 둘 중의 한 장은 광이어야 한다.
 * 즉 SutdaCard의 인스턴스변수 isKwang의 값이 true여야 한다. */

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < 10; i++) {
            int cardNum = i + 1;
            boolean isKwang = (cardNum == 1 || cardNum == 3 || cardNum == 8); // 1K, 3K, 8K exist
            cards[i] = new SutdaCard(cardNum, isKwang);
            cards[i + 10] = new SutdaCard(cardNum, false);
        }
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    @Override
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}
public class Ex1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }
    }
}
