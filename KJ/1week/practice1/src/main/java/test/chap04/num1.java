package test.chap04;

public class num1 {
    public static void main(String[] args) {
        /* 설명. 문제 4-2. 1부터 20까지의 정수 중에서 2 또는 3의 배수가
        *   아닌 수의 총합을 구하시오. */

        int i ;
        int sum = 0;
        for(i = 0; i <= 20; i++){
            if (i % 2 == 0 || i % 3 ==0 ){
                sum = sum + 0;
            }
            else {
                sum = sum + i;
            }
        }
        System.out.println("sum = " + sum);
    }
}
