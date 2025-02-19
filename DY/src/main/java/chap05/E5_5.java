package chap05;

public class E5_5 {
    public static void main(String[] args) {
        int[] ballArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] ball3 = new int[3];

        for(int i = 0; i < ballArr.length; ++i) {
            int j = (int)(Math.random() * (double)ballArr.length + (double)1.0F);
            int tmp = 0;
            if (j == ballArr[i]) {
                tmp = ballArr[0];
                ballArr[0] = j;
                ballArr[i] = tmp;
            }
        }

        for(int i = 0; i < ball3.length; ++i) {
            ball3[i] = ballArr[i];
        }

        for(int i = 0; i < ball3.length; ++i) {
            System.out.print(ball3[i]);
        }

    }
}
