package W01.chap02;

public class E2_9 {
/*
    Q. 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)

    byte b = 10;
    char ch = 'A';
    int i = 100;
    long l = 1000L;

    a. b = (byte)i;
    b. ch = (char)b;
    c. short s = (short)ch;
    //  short: - ~ +
    //  char: 0 ~

    d. float f = (float)l;
    // 실수형은 정수형보다 포함하는 범위가 더 넒음


    e. i = (int)ch;

    A. d, e
    */



    /*
        (헷갈려서 지피티한테 물어봤는데 ...)

        b = (byte)i;
        int → byte (다운캐스팅)
        int가 byte보다 크므로 명시적 형변환이 필요함
        형변환을 생략할 수 없음. ❌
        ch = (char)b;

        byte → char (다운캐스팅)
        byte는 부호 있는 8비트, char는 부호 없는 16비트라서 자동 형변환이 안 됨.
        형변환을 생략할 수 없음. ❌
        short s = (short)ch;

        char → short (다운캐스팅)
        char는 16비트(부호 없음), short는 16비트(부호 있음)
        자동 형변환이 안 됨.
        형변환을 생략할 수 없음. ❌
        float f = (float)l;

        long → float (업캐스팅)
        long(64비트 정수) → float(32비트 실수)은 자동 형변환 가능
        형변환을 생략할 수 있음. ✅
        i = (int)ch;

        char → int (업캐스팅)
        char(16비트 부호 없음) → int(32비트 부호 있음)으로 자동 형변환 가능
        형변환을 생략할 수 있음. ✅
    */
}
