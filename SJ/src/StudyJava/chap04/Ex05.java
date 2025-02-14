package StudyJava.chap04;

public class Ex05 {
    /*
    *  다음은 주어진 문자열 이 숫자인지를 판별하는 프로그램이다 (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
*/
    public static void main(String[] args) {
        String value = "12o34";
        char ch = ' ';
        boolean isNumber = true;

        for(int i=0; i < value.length() ;i++) {
/*
(1) . 알맞은 코드를 넣어 완성하시오
*/
            ch = value.charAt(i);
            if((ch-'0')>9 || 0 > (ch-'0')){
                isNumber = false;
            }
        }
        if (isNumber) {
            System.out.println(value+" 는 숫자입니다.");
        } else {
            System.out.println(value+" 는 숫자가 아닙니다.");
        }

    }
}
