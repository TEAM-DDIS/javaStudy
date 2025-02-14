package com.study.chap04;

/* 4-10. num의 값이 12345라면 1+2+3+4+5의 결과인 15를 출력하라. */
public class Ex10 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;

        while(num != 0){
            sum += num % 10;
//            System.out.println(num);
            num /= 10;
        }
        System.out.println("sum = " + sum);
    }
}

//  15