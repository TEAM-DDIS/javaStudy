package com.study.chap03;

/* 3-4. num의 값 중 백의 자리 이하를 버리는 코드  */
public class Ex4 {
    public static void main(String[] args) {
        int num = 456;
        System.out.println(num - (num % 100));
    }
}

// 400