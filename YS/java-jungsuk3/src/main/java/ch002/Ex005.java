package ch002;
/*
Ex005. 다음 문장들의 출력 결과를 적으세요. 오류가 있는 문장의 경우 괄호 안에 '오류' 라고 적으시오.
* */

public class Ex005 {
    public static void main(String[] args) {
        System.out.println("1" + "2");          // 12
        System.out.println(true + "");          // true
        System.out.println('A' + 'B');          // 131
        System.out.println('1' + 2);            // 51
        System.out.println('1' + '2');          // 99
        System.out.println('J' + "ava");        // Java
//        System.out.println(true + null);        // 오류
    }
}
