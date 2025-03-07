package com.study.chap08;

// 8-6. 아래의 코드가 수행되었을 때 실행결과를 적으시오
public class Ex6 {
    public static void main(String[]args){
        try{
            method1();
        }catch(Exception e){
            System.out.println(5);
        }
    }

    static void method1(){
        try{
            method2();
            System.out.println(1);
        }catch(ArithmeticException e){
            System.out.println(2);
        }finally{
            System.out.println(3);
        }
        System.out.println(4);
    } //method1()

    static void method2(){
        throw new NullPointerException();
    }
}
/*
* method1 호출
* method2 호출
* NullPointerException 실행
* ArithmeticException에서 안잡힙
* finally 블록 실행 -> 3 출력 (예외가 발생한 것임 일단)
* 예외처리가 안됐으므로 main
* 더 큰 범위인 Exception에서는 잡힙 -> 5 출력
* */


// 3
// 5