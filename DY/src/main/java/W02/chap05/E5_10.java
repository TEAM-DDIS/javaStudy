package W02.chap05;

public class E5_10 {
    public static void main(String[] args) {
        char[] abcCode =
                {'`','~','!','@','#','$','%','^','&','*',
                        '(',')','-','_','+','=','|','[',']','{',
                        '}',';',':',',','.','/'};
        char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};

        String src = "abc123";
        String result = "";

        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);

            if (ch >= '0' && ch <= '9') {
                for (int j = 0; j < numCode.length; j++) {
                    if (ch == j+48) {
                        result += numCode[j];
                    }
                }
            } else {
                for (int j = 0; j < abcCode.length; j++) {
                    if (ch == j+97) {
                        result += abcCode[j];
                    }
                }
            }
        }

        System.out.println("src: " + src);
        System.out.println("result: " + result);
    }
}
