package StudyJava.chap05;

/*
* 주어진 차원 배열의 데이터보다 가로와 세로로 이 더 큰 배열을 생성해서 배열
의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램이다.
(1)에 알맞은 코드를 넣어서 완성하시오.
*/

public class Ex01 {
    public static void main(String[] args)
    {
        int[][] score = {
                {100, 100, 100}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
                , {50, 50, 50}
        };
        int[][] result = new int[score.length+1][score[0].length+1];
        for(int i=0; i < score.length;i++) {
            for(int j=0; j < score[i].length;j++) {
/*
(1) . 알맞은 코드를 넣어 완성하시오

*/

                result[i][j] = score[i][j];
                result[i][score[0].length] = result[i][score[0].length] + score[i][j];
                result[score.length][j] = result[score.length][j] + score[i][j];
            }
        }
        for(int i=0; i < result.length;i++) {
            for(int j=0; j < result[i].length;j++) {
                System.out.printf("%4d",result[i][j]);
            }
            System.out.println();
        }
    } // main

}
