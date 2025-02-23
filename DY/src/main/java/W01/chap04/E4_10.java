package W01.chap04;

public class E4_10 {
    public static void main(String[] args) {
        int num = 12345;

        int sum;
        for(sum = 0; num > 0; num /= 10) {
            sum += num % 10;
        }

        System.out.println("sum: " + sum);
    }
}
