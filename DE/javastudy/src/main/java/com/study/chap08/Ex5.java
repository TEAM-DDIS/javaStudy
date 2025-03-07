package com.study.chap08;

// 8-5. 아래의 코드가 수행되었을 때의 실행결과를 적으시오.
public class Ex5 {
    static void method(boolean b) {
        try {
            System.out.println(1);
            if (b) throw new ArithmeticException();
            System.out.println(2);
        } catch(RuntimeException r){
            System.out.println(3);
            return;
        } catch (Exception e){
            System.out.println(4);
            return;
        } finally {
            System.out.println(5);
        }

        System.out.println(66);
    }

    public static void main(String[] args) {
        method(true);
        method(false);
    }
}
// true
// 1 -> 일단 실행
// 3 -> 상위 exception으로 들어가고 return
// 5 -> finally
// return 되었으므로 66은 실행되지 않는다.

// false
// 1 -> 일단 실행
// 2 -> catch 구문에 들어가지 않았으므로 실행
// 5 -> finally
// 66 -> retrun 된 구문이 없으므로 66 실행
