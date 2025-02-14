package StudyJava.chap04;

public class Ex03 {
    /*방정식 2x+4y=10 의 모든 해를 구하시오 단 x와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10 . */
    public static void main(String[] args) {
        int x , y = 0;
        for(x=0; x<=10; x++){
            for ( y = 0; y <= 10; y++) {
                if((x*2)+(4*y) == 10){
                    System.out.println("x= " + x +", y= " + y);
                }
            }
        }
    }
}
