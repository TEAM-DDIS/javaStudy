package com.study.chap05;

/* 5-6. 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제
 *      money의 금액을 동전으로 바꾸었을 때, 각각 몇 개의 동전이 필요한지 계산
 *      단, 가능한 한 적은 수의 동전으로 거슬러 주어야한다. */

public class Ex6 {
    public static void main(String[] args) {
        int[] coinUnit = {500, 100, 50, 10};

        int money = 2680;
        System.out.println("money = " + money);

        for (int i = 0; i < coinUnit.length; i++) {
            System.out.println(coinUnit[i] + "원: " + money / coinUnit[i]);
            money %= coinUnit[i];
//            System.out.println(money);
        }
    }
}

/* money = 2680
 * 500원: 5
 * 100원: 1
 * 50원: 1
 * 10원: 3
 * */