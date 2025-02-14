package chap05;

public class E5_8 {
    public static void main(String[] args) {
        int[] answer = new int[]{1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
        int[] counter = new int[4];

        for(int i = 0; i < answer.length; ++i) {
            if (answer[i] == 1) {
                int var10002 = counter[0]++;
            } else if (answer[i] == 2) {
                int var6 = counter[1]++;
            } else if (answer[i] == 3) {
                int var7 = counter[2]++;
            } else {
                int var8 = counter[3]++;
            }
        }

        for(int i = 0; i < counter.length; ++i) {
            System.out.print(counter[i]);

            for(int j = 0; j < counter[i]; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
