package com.study.chap06;

/* 6-3. Student 클래스를 정의하시오 */
public class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student() {
    }

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    // 국어, 영어, 수학의 점수를 모두 더해서 반환한다.
    public int getTotal() {
        return kor + eng + math;
    }

    // 총점을 과목수로 나눈 평균을 구한다.
    // 소수점 둘째자리에서 반올림할 것
    public double getAverage() {
//        (int) ((5 / 9f * (fahrenheit - 32)) * 100 + 0.5) / 100f;
        return (int) ((kor + eng + math) / 3.0 * 10 + 0.5) / 10.0;
    }

    public String info() {
        return name + ", " + ban + ", " +  no + ", " + kor + ", " + eng + ", " + math + ", " + getTotal() + ", " + getAverage();
    }
}
