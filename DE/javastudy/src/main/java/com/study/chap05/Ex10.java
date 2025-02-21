package com.study.chap05;

/* 5-10. 알파벳과 숫자를 주어진 암호표로 암호화하는 프로그램 */
public class Ex10 {
    public static void main(String[] args) {
        char[] abcCode =
                {'`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
                '(', ')', '-', '_', '+', '=', '|', '[', ']', '{',
                '}', ';', ':', ',', '.', '/'};

        //0 1 2 3 4 5 6 7 8 9
        char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};

        String src = "abc123";
        String result = "";

        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);

            if (ch-'0' >= 0 && ch-'0' <= 9) {
                result += numCode[ch-'0'];
            } else {
                result += abcCode[ch-97];
            }
        }

        System.out.println("src:" + src);
        System.out.println("result:" + result);
    }
}

// src:abc123
// result:`~!wer