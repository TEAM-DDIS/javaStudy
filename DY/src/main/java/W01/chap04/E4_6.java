package W01.chap04;

public class E4_6 {
    public static void main(String[] args) {
        for(int i = 1; i <= 6; ++i) {
            for(int j = 1; j <= 6; ++j) {
                if (i + j == 6) {
                    System.out.println("첫 번째 수: " + i + ", 두 번째 수: " + j);
                }
            }
        }

    }
}
