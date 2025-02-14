package StudyJava.chap04;

public class Ex02 {
    /*
     숫자로 이루어진 문자열  str이 있을 때 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라
     만일 문자열이 라 . "12345" 면 의 , ‘1+2+3+4+5’ 결과인 15 를 출력이 출력되어야 한다
     (1)에 알맞은 코드를 넣으시오 .
*/
    public static void main(String[] args) {

        String str = "12345";
        int sum = 0;
        for(int i=0; i < str.length(); i++) {
           sum = sum + (str.charAt(i)-'0');
/*
(1) . 알맞은 코드를 넣어 완성하시오
*/
        }
        System.out.println("sum="+sum);

    }
}
