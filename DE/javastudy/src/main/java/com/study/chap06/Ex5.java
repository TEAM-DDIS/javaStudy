package com.study.chap06;

/* 6-5. Student 클래스에 생성자와 info()를 추가하시오. */
public class Ex5 {
    public static void main(String[] args) {
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);

        System.out.println(s.info());
    }
}

// 홍길동, 1, 1, 100, 60, 76, 236, 78.7