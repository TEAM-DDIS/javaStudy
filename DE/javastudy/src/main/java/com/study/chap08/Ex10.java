package com.study.chap08;

/* 8-10. 아래의 코드가 수행되었을 때의 실행결과를 적으시오 */
public class Ex10 {
    public static void main(String[]args){
        try{
            method1();
            System.out.println(6);
        }catch(Exception e){
            System.out.println(7);
        }
    }
    static void method1() throws Exception{
        try{
            method2();
            System.out.println(1);
        }catch(NullPointerException e){
            System.out.println(2);
            throw e;
        }catch(Exception e){
            System.out.println(3);
        }finally{
            System.out.println(4);
        }
        System.out.println(5);
    } //method1()
    static void method2(){
        throw new NullPointerException();
    }

}
// 2 -> NullPointerException e에서 처리
// 4 -> 처리 되었으므로 main의 e로 던져짐
// 7 -> Exception e에서 처리
