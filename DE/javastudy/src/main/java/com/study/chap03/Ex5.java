package com.study.chap03;

/* 3-5. num의 값 중에서 일의 자리를 1로 바꾸는 코드 */
public class Ex5 {
    public static void main(String[] args) {
        int num = 333;
        System.out.println(num - (num % 10) + 1);
    }
}

// 331