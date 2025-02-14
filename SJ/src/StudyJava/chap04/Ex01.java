package StudyJava.chap04;

public class Ex01 {
    /*다음은 숫자맞추기 게임을 작성한 것이다 과 사이의 값을 반복적으로 입력 . 1 100
해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다 사용자가 값을 입력하면 컴퓨터는 자 . ,
신이 생각한 값과 비교해서 결과를 알려준다 사용자가 컴퓨터가 생각한 숫자를 맞추면 .
게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다 에 알맞은 코드를 넣어 프 . (1)~(2)
로그램을 완성하시오.
*/
    public static void main(String[] args) {
        // 1~100  사이의 임의의 값을 얻어서 answer에 저장한다
        int answer = /* (1) */(int)((Math.random()*100)+1);
        int input = 0; // 사용자입력을 저장할 공간
        int count = 0; // 시도횟수를 세기위한 변수
// Scanner 화면으로 부터 사용자입력을 받기 위해서 클래스 사용
        java.util.Scanner s = new java.util.Scanner(System.in);
        do {
            count++;
            System.out.print("1과 100 사이의 값을 입력하세요 :");
            input = s.nextInt(); // input . 입력받은 값을 변수 에 저장한다

            if (input > answer) {
                System.out.println("더 작은 수를 입력하세요");
            } else if (input < answer) {
                System.out.println("더 큰 수를 입력하세요");
            } else {
                System.out.println("맞췄습니다.");
                System.out.println("시도횟수는" + count +"번 입니다.");
                break;
            }
/*
(2) . 알맞은 코드를 넣어 완성하시오
*/
        } while(true); // 무한반복문
    }
}
