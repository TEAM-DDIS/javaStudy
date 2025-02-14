package com.study.chap03;

/* 3-3. num의 값에 따라 '양수', '음수', '0'을 출력하는 코드 */
public class Ex3 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println((num > 0) ? "양수" : ((num == 0) ? 0 : "음수"));
    }
}

// 양수
