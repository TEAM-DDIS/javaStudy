package StudyJava.chap07;

public class Circle extends Shape{
        private double r;

        public Circle(){

        }

        public Circle(double r) {
            this.r = r;
        }
        @Override
        double calcArea() {
            return r*r*3.14;
        }
    }
