package test.chap04;

public class num2 {
    public static void main(String[] args) {
        /* 설명. 문제 4-3  */

        int i;
        int sum = 0;
        int totalsum = 0;
        for (i = 0; i <= 10; i++ ) {
            sum = sum + i;
            totalsum = totalsum + sum;
            }
        System.out.println(totalsum);
        }


}
