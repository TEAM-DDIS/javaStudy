package com.study.chap06;

/* 6-7. 문제 6-6에서 작성한 클래스메서드 getDistance()를 MyPoint클래스의
*       인스턴스 메서드로 정의하시오 */
public class Ex7 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1, 1);

        // p와 (2, 2)의 거리를 구한다.
        System.out.println(p.getDistance(2, 2));
    }
}

// 1.4142135623730951