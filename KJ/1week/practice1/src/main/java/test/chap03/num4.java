package test.chap03;

public class num4 {
    public static void main(String[] args) {
        /* 설명. 문제 3-6. 아래는 변수 num의 값보다 크면서 가장 가까운 10의 배수에서
        *      변수 num의 값을 뺀 나머지를 구하는 코드이다. 예를 들어, 24의 크면서도 가장 가까운 10의 배수는
        *      30이다. 19의 경우 ...
        *  */

        int num = 19;
        System.out.println(((num/10 * 10) + 10) - num );



    }

}
