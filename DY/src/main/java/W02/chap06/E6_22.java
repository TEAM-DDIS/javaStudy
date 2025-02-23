package W02.chap06;

public class E6_22 {
    static boolean isNumber(String str) {
        char[] chArr = str.toCharArray();
        for (int i = 0; i < chArr.length; i++) {
            if (!Character.isDigit(chArr[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));

        str = "1234ㅇ";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
    }
}
