package StudyJava.chap07;

public class Rectangle extends Shape{

        private double width;
        private double height;

        public Rectangle() {

        }
        public Rectangle(int width, int height){
            this.width = width;
            this.height = height;
        }

        @Override
        double calcArea() {
            return width*height;
        }

        public boolean isSquare(){
            return width == height;
        }
    }
