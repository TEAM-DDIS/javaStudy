/*
Ex009. 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다. 이 클래스의 멤버
중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
(단, 모든 병사의 공격력과 방어력은 같아야 한다.)
* */

package ch006;

public class Ex009 {
    class Marine {
        int x=0, y=0; // Marine (x,y) 의 위치좌표
        int hp = 60; // 현재 체력
        int weapon = 6; // 공격력
        int armor = 0; // 방어력
        void weaponUp() {
            weapon++;
        }
        void armorUp() {
            armor++;
        }
        void move(int x, int y) {
                this.x = x;
                this.y = y;
        }
    }
}

/*
정답 : int weapon, int armor, void armorUp(), void move()
        문제에서 모든 병사들의 공격력과 방어력이 같다고 명시되어 있음.
        개별 병사가 아닌 모든 병사가 같은 값을 공유해야 함.
        weaponUp()과 armorUp()의 경우도 병사 개별의 공격력과 방어력이 아닌
        전체 병사의 공격력과 방어력을 증가시켜야함.
        static 변수를 다루기 때문에 메소드도 static을 명시해야함
        위치좌표에 static을 쓰면 모든 병사의 위치가 같아지는 문제가 발생함.

* */
