package com.study.chap03;

/* 3-9. 문자형 변수 ch가  영뮨자이거나 숫자일 때만 */
public class Ex9 {
    public static void main(String[] args) {
        char ch = 'z';
        // 대문자 65~90, 소문자 97~122, 숫자 48~57
        boolean b = ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) || (ch >= 48 && ch <= 57)) ? true : false;

        System.out.println(b);
    }
}

// true