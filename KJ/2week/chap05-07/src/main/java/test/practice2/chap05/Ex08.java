package test.practice2.chap05;

public class Ex08 {
    public static void main(String[] args) {
        int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
        int[] counter = new int[4];

        for (int i = 0; i < answer.length; i++) {
            /* 알맞은 코드를 넣어 완성하시오. */
            counter[answer[i]-1]++;                 //counter 배열에 수가 출현하는 빈도만큼
                                                    // 카운트 증가
        }

        for (int i = 0; i < counter.length; i++) {
            /* 알맞은 코드를 넣어 완성하시오. */
            System.out.print(counter[i]);

            for(int j=0; j < counter[i]; j++) {     // 빈도수만큼 별 찍기
                System.out.print("*");
            }
            System.out.println();
        }

    }   // end of main
}   // end of class
