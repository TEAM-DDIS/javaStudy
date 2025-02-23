package W02.chap06;

public class E6_3_4_5 {
    public static void main(String[] args) {

        Student s = new Student();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("이름: " + s.name);
        System.out.println("총점: " + s.getTotal());
        System.out.println("평균: " + s.getAverage());

        //E6_5
        Student s2 = new Student("홍길동", 1, 1, 100, 60, 76);

        System.out.println(s2.info());
    }
}

class Student {
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

    public int getTotal() {
        return kor + eng + math;
    }

    public float getAverage() {
        double avg = Math.round(((float) (kor + eng + math) / 3) * 10) / 10.0;
        return (float) avg;
    }

    public String info() {
        return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math
                            + ", " + getTotal() + ", " + getAverage();
    }
}