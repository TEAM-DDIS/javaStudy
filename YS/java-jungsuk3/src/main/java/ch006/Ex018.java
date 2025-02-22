package ch006;

public class Ex018 {
    class MemberCall {
        int iv = 10;
        static int cv = 20;
        int iv2 = cv;
//        static int cv2 = iv; // A 라인

        static void staticMethod1() {
            System.out.println(cv);
//            System.out.println(iv); // B 라인
        }

        void instanceMethod1() {
            System.out.println(cv);
            System.out.println(iv); // C 라인
        }

        static void staticMethod2() {
            staticMethod1();
//            instanceMethod1(); // D 라인
        }

        void instanceMethod2() {
            staticMethod1(); // E 라인
            instanceMethod1();
        }

    }
}

/*
정답 : A, B, D
        A : static 변수 선언에 인스턴스 변수를 사용할 수 없음.
        B : static 메소드에 인스턴스 변수를 사용할 수 없음.
        D : static 메소드에서 인스턴스 메소드를 사용할 수 없음.
 */
