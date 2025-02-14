package com.study.chap03;

/* 3-10. 대문자를 소문자로 변경하는 코드 */
public class Ex10 {
    public static void main(String[] args) {
        char ch = 'A';
        // 대문자 65~90, 소문자 97~122, 숫자 48~57
        char lowerCase =  (ch >= 65) && (ch <= 90) ? (char)(ch + 32) : ch;

        System.out.println("ch : " + ch);
        System.out.println("ch to lowerCase: " + lowerCase);
    }
}

// a