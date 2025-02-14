package com.study.chap04;

/* 4-1. 다음의 문장들을 조건식으로 표현하라 */
public class Ex1 {
    public static void main(String[] args) {
        // 1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
        int x = 15;
        if (x > 10 && x < 20) System.out.println("1. true");

        // 2. char형 변수 ch가 공백이나 탭이 아닐 때 true 조건식
        char ch = 'd';
        if (ch != ' ' || ch != '\t') System.out.println("2. true");

        // 3. char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식
        ch = 'X';
        if (ch == 'x' || ch == 'X') System.out.println("3. true");

        // 4. char형 변수 ch가 숫자('0'~'9')일 때  true인 조건식
        // 대문자 65~90, 소문자 97~122, 숫자 48~57
        ch = '0';
        if (ch >= 48 && ch <= 57) System.out.println("4. true");

        // 5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
        ch = 'a';

        // 6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true인 조건식


        // 7. boolean형 변수 powerOn가 false일 때 true인 조건식


        // 8. 문자열 참조변수 str이 "yes"일 때 true인 조건식
    }
}
