package W02.chap06;

import java.util.Arrays;

public class E6_23 {

    static int max(int[] arr) {
        if (arr == null) {
            return -999999;
        }

        int maxNum = 0;
        for (int i = 0; i < arr.length; i++) {
            maxNum = Math.max(maxNum, arr[i]);
        }

        if (arr.length == 0) {return -999999;}

        return maxNum;
    }

    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(Arrays.toString(data));
        System.out.println("최대값: " + max(data));
        System.out.println("최대값: " + max(null));
        System.out.println("최대값: " + max(new int[]{}));

    }
}
