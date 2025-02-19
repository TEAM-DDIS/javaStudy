package chap03;

public class E3_10 {
    public static void main(String[] args) {
        char ch = 'A';
        char chLower = (char)(ch + 32);
        char lowerCase = ch >= 'A' && ch <= 'Z' ? chLower : ch;
        System.out.println("ch: " + ch);
        System.out.println("ch to lowerCase: " + lowerCase);
    }
}
