package test.chap04;

public class num3 {
    public static void main(String[] args) {
        /* 설명. 문제 4-9. */

        String str = "12345";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i) - '0';
            System.out.println(ch);
            sum = sum + ch;
        }

        System.out.println(sum);

    }
}
