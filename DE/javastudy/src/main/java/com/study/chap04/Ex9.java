package com.study.chap04;

/* 4-9. 문자열 "12345"라면 1+2+3+4+5의 결과인 15를 출력하라 */
public class Ex9 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;

        for(int i = 0; i<str.length(); i++){
            char a = str.charAt(i);
            sum += a - '0'; // 문자에서 문자 '0'의 아스키 코드를 빼주면 원하는 숫자가 나온다.
        }

        System.out.println("sum = " + sum);
    }
}

// 15