package test.practice2.chap05;

public class Ex05 {

    /* 설명. 문제 5-5. 다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는
    *    프로그램이다. (1) ~ (2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
    *  */
    public static void main(String[] args) {
        int[] ballArr = {1,2,3,4,5,6,7,8,9};
        int[] ball3 = new int[3];

//        배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
        for(int i =0;i <ballArr.length; i++){
            int j= (int)(Math.random()*ballArr.length);
            int tmp=0;

            tmp = ballArr[i];       // 현재 인덱스 i의 요소를 임시 변수에 저장
            ballArr[i]=ballArr[j];  // 임의의 인덱스 j의 요소를 현재 인덱스 i로 이동
            ballArr[j]=tmp;         // 임시 변수의 값을 임의의 인덱스 j로 이동

            /* 설명. Fisher - Yates 셔플 알고리즘 기반한 간단한 섞기 방법
            *    이와 같은 방식으로 i가 배열의 끝까지 순회하면서 요소들을 무작위로 섞음
            *   이 과정에서 같은 인덱스끼리 교환이 이루어지면 배열의 상태는 변하지 않지만
            *   전체적으로 무작위성이 보장돼. 최정 결과로 ballArr 배열이 무작위로 섞이게 됨.*/

        }
//        배열의 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다
        System.arraycopy(ballArr, 0, ball3, 0, 3);


        for(int i = 0; i < ball3.length; i++) {
            System.out.print(ball3[i]);
        }
    }
}
