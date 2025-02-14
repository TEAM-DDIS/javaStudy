package test.chap04;

public class num4 {
    public static void main(String[] args) {

        /* 설명. 문제 4-10. */

        int num = 12345;
        int sum = 0;

        while(num > 0) {
            sum = sum + num % 10;
            System.out.println(sum);
            num = num / 10;
        }


        System.out.println("sum= " + sum);
        }

}
