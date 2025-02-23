package W02.chap06;

public class E6_6 {
    static double getDistance(int x, int y, int x1, int y1) {
        int dx = Math.abs(x - x1);
        int dy = Math.abs(y - y1);

        return Math.sqrt((double) dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));

    }
}