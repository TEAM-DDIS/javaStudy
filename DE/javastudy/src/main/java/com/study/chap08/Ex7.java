package com.study.chap08;

/* 8-7. 아래의 코드가 수행되었을 떄의 실행결과를 적으시오. */
public class Ex7 {
    static void method(boolean b){
        try{
            System.out.println(1);
            if(b)System.exit(0);
            System.out.println(2);
        }catch(RuntimeException r){
            System.out.println(3);
            return;
        }catch(Exception e){
            System.out.println(4);
            return;
        }finally{
            System.out.println(5);
        }
        System.out.println(6);
    }
    public static void main(String[]args){
        method(true);
        method(false);
    }//main
}

// 1. 결과: true
// 1
// 시스템 종료 -> 5, 6 실행 안됨

// 2. 결과: false
// 1
// 2
// 5
// 6

/* 설명.
*   - boolean을 매개변수로 받은 것은 코드 내에서 사용하기 위함
*   - try 구문은 예외처리 의심안되는 문장도 일단 훑는다. */