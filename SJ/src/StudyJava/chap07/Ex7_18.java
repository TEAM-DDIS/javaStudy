package StudyJava.chap07;

public class Ex7_18 {
    public static void main(String[] args) {
        Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
        for (int i = 0; i < arr.length; i++)
            action(arr[i]);
    } // main

    private static void action(Robot r) {
        if (r instanceof DanceRobot) {
            DanceRobot danceRobot = (DanceRobot) r;
            danceRobot.dance();
        } else if (r instanceof SingRobot) {
            SingRobot singRobot = (SingRobot) r;
            singRobot.sing();
        } else if (r instanceof DrawRobot) {
            DrawRobot drawRobot = (DrawRobot) r;
            drawRobot.draw();
        }
    }
}
class Robot {}
class DanceRobot extends Robot {
    void dance() {
        System.out.println(" .");
    }
}
class SingRobot extends Robot {
    void sing() {
        System.out.println(" .");
    }
}
class DrawRobot extends Robot {
    void draw() {
        System.out.println(" ."); 
    }
}


