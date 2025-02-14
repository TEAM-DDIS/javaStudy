package StudyJava.chap03;

public class Ex02 {
    /*아래는 화씨 를 섭씨 로 변환하는 코드이다 변환공식이 (Fahrenheit) (Celcius) . 'C =
5/9 ×(F - 32)' , (1) . , 라고 할 때 에 알맞은 코드를 넣으시오 단 변환 결과값은 소수점
셋째자리에서 반올림해야한다 Math.round()를 사용하지 않고 처리할 것 .( )
*/
    public static void main(String[] args) {
        int fahrenheit = 100;
        float celcius = ( /* (1) */  (((int)(((float)(fahrenheit-32))*1000*5/9))/(float)1000));
        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+celcius);
    }
}
