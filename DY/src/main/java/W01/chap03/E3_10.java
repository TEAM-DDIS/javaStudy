package W01.chap03;

public class E3_10 {
    public static void main(String[] args) {
        char ch = 'A';
        char lowerCase = (ch >= 'A' && ch <= 'Z') ? (char)(ch + 32) : ch;

        System.out.println("ch: " + ch);
        System.out.println("ch to lowerCase: " + lowerCase);
    }
}
