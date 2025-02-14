package com.study.chap03;

/* 3-2. 사과를 담는데 필요한 바구니의 수를 구하는 코드 */
public class Ex2 {
    public static void main(String[] args) {
        int numOfApples = 123;  // 사과 개수
        int sizeOfBucket = 10;  // 바구니 크기
        int numOfBucket = (123 % 10 == 0) ? (numOfApples / sizeOfBucket) : (numOfApples / sizeOfBucket) + 1;

        System.out.println("필요한 바구니의 수 : " + numOfBucket);
    }
}

// 13