package com.study.chap03;

/* 3-6. num 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을 뺀 나머지를 구하는 코드
 * 24의 크면서도 가장 가까운 120의 배수는 30, 19의 경우 20 */
public class Ex6 {
    public static void main(String[] args) {
        int num = 24;
        System.out.println(((num/10) + 1) * 10-num);
    }
}

// 6