/*
Ex001. 섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeek클래스)을 정의한 것이다.
        섯다카드 20장을 담는 SutdaCard배열을 초기화하시오. 단, 섯다카드는 1부터 10까지의 숫자가
        적힌 카드가 한 쌍씩 있고, 숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광(Kwang)이어야 한다.
        즉, SutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다.
 */

package ch007;

import java.util.Random;

public class Ex001_002 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for(int i=0; i < deck.cards.length;i++)
            System.out.print(deck.cards[i]+",");

        System.out.println();
        System.out.println(deck.pick(0));

    }
}


class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < 10; i++) {
            int num = i + 1;
            boolean isKwang = num == 1 || num == 3 || num == 8;

            cards[i] = new SutdaCard(num, isKwang);
            cards[i+10] = new SutdaCard(num, false);
        }
    }
    /*
    Ex002. Ex001의 SutdaDeck클래스에 다음에 정의된 새로운 메소드를 추가하고 테스트하시오.
            1. 메소드명 : shuffle
               기   능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다.(Math.radom()사용)
               반환타입 : 없음
               매개변수 : 없음

            2. 메소드명 : pick
               기   능 : 배열 cards에서 지정된 위치의 SutdaCard를  반환한다.
               반환타입 : SutdaCard
               매개변수 : int index - 위치

            3. 메소드명 : pick
               기   능 : 배열 cards에서 임의의 위치와 SutdaCard를 반환한다.(Math.random()사용)
               반환타입 : SutdaCard
               매개변수 : 없음
     */
   void shuffle() {
       Random rand = new Random();
       for (int i = 0; i < cards.length; i++) {
           int randIndex = rand.nextInt(CARD_NUM);
           SutdaCard temp = cards[i];
           cards[i] = cards[randIndex];
           cards[randIndex] = temp;

       }

    }

    SutdaCard pick(int index) {
       if (index < 0 || index >= CARD_NUM) {
           return null;
       }
       return cards[index];
    }

    SutdaCard pick() {
       int index = (int)(Math.random() * CARD_NUM);
       return pick(index);

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
    // info() 대신 Object클래스의 toString()을 오버라이딩했다.
    @Override
    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}
