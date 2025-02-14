package ch002;

/*
Ex009. 다음 중 형변환을 생략할 수 있는 것은?
* */

public class Ex009 {
    public static void main(String[] args) {

        byte b = 10;
        char ch = 'A';
        int i = 100;
        long l = 10000L;

        b = (byte) i;
        ch = (char) b;
        short s = (short) ch;
        float f = (float) l;    // 생략가능
        i = (int) ch;           // 생략가능

    }
}
