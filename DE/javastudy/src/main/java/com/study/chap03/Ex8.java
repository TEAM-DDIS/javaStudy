package com.study.chap03;

/* 3-8. 아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오 */
public class Ex8 {
    public static void main(String[] args) {
//        byte a = 10;
//        byte b = 20;
//        byte c = a + b;
//
//        char ch = 'A';
//        ch = ch + 2;
//
//        float f = 3 / 2;
//        long l = 3000 * 3000 * 3000;
//
//        float f2 = 0.1f;
//        double d= 0.1;
//
//        boolean result = d == f2;


        byte a = 10;
        byte b = 20;
        int c = a + b;

        char ch = 'A';
//        ch = ch + 2;

        float f = 3 / 2f;
        long l = 3000 * 3000 * 3000l;

        float f2 = 0.1f;
        double d= 0.1;

        boolean result = d != f2;

        System.out.println("c = " + c);
        System.out.println("ch = " + ch);
        System.out.println("f = " + f);
        System.out.println("l = " + l);
        System.out.println("result = " + result);
    }
}

/*
c = 30
ch = A
f = 1.5
l = 27000000000
result = true
 */