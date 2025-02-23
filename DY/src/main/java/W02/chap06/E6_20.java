package W02.chap06;

import java.util.Arrays;

public class E6_20 {

    static int[] shuffle(int[] arr) {
        int[] shuffled = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            shuffled[i] = (int) (Math.random() * (arr.length - 1) + 1);
            for (int j = 0; j < i; j++) {
                if (shuffled[j] == shuffled[i]) {
                    i = j-1;
                }
                break;
            }
        }

        return shuffled;
    }


    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(original));

        int[] result = shuffle(original);

        System.out.println(Arrays.toString(result));
    }
}
