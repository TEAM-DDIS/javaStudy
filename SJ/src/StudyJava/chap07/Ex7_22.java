package StudyJava.chap07;

public class Ex7_22 {
    public static void main(String[] args) {
        Shape[] arr = {new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
        System.out.println(" :" + sumArea(arr));
    }

    private static double sumArea(Shape[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].calcArea();
        }
        return sum;
    }
}

    abstract class Shape {
        Point p;
        Shape() {
            this(new Point(0,0));
        }
        Shape(Point p) {
            this.p = p;
        }
        abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
        Point getPosition() {
            return p;
        }
        void setPosition(Point p) {
            this.p = p;
        }
    }
    class Point {
        int x;
        int y;
        Point() {
            this(0,0);
        }
        Point(int x, int y) {
            this.x=x;
            this.y=y;
        }
        public String toString() {
            return "["+x+","+y+"]";
        }
    }





