package ch007;

public class Ex015 {
    public static void main(String[] args) {
        class Unit {
        }
        class AirUnit extends Unit {
        }
        class GroundUnit extends Unit {
        }
        class Tank extends GroundUnit {
        }
        class AirCraft extends AirUnit {
        }
        Unit u = new GroundUnit();
        Tank t = new Tank();
        AirCraft ac = new AirCraft();

        u = (Unit)ac;
        u = ac;
        GroundUnit gu = (GroundUnit)u;
        AirUnit au = ac;
        t = (Tank)u;
        GroundUnit gu = t;


    }
}
