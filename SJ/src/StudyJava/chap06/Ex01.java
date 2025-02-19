package StudyJava.chap06;

public class Ex01 {
    /* [6-24]
    다음과 같이 정의된 메서드를 작성하고 테스트하시오.
    메서드명:abs
    기능:   주어진값의절대값을반환한다: .
    반환타입: int
    매개변수: intvalue */

    private static int abs(int value) {
        return Math.abs(value);
    }

    public static void main(String[]args)
    {
        int value=5;
        System.out.println(value+"의 절대값:"+ abs(value));
        value=-10;
        System.out.println(value+"의 절대값 :"+ abs(value));
    }


}
