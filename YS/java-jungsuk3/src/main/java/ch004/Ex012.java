/*
Ex012. 구구단의 일부분을 다음과 같이 출력하시오.
* */


package ch004;

public class Ex012 {
    public static void main(String[] args) {
        for (int i = 2; i <= 8; i+=3) {
            for (int j = 1; j <= 3; j++) {
                for (int k = i; k < i + 3 && k <= 9; k++) {
                    System.out.print(k + " * " + j + " = " + (k * j) + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
