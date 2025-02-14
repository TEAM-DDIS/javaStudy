package com.study.chap04;

/* 4-3.1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과 */
public class Ex3 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("(");
            for (int j = 1; j <= i; j++){
                sum += j;
                System.out.print(j + "+");
            }
            System.out.print(")+");
        }
        System.out.println();
        System.out.println("sum = " + sum);
    }
}

// 220