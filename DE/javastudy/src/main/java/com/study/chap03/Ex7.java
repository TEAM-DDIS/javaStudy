package com.study.chap03;

/* 3-7. 화씨를 섭씨로 변환하는 코드
 *      변환 결과값은 셋째자리에서 반올림(Math.round() 사용 금지)   */
public class Ex7 {
    public static void main(String[] args) {
        int fahrenheit = 100;
        float celcius = (int) ((5 / 9f * (fahrenheit - 32)) * 100 + 0.5) / 100f;

        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Celcius: " + celcius);
    }
}

/*
* 5 / 9f 사용하여 float 연산 유도 (5 / 9 그대로 두면 0 됨).
* 100 → 소수점 둘째 자리까지 정수로 변환.
* + 0.5 → 반올림을 위해 0.5 추가.
* (int) → 정수로 변환하여 소수점 이하 버림(반올림 효과).
* 100f → 다시 float으로 변환하여 원래 크기로 복원.
* */