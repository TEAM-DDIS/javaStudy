package com.study.chap06;

/* 6-9. 병사 클래스로 정의한 것.
        클래스의 멤버 중 static을 붙여야 하는 것은 어떤 것들이고 그 이유는?
        (단, 모든 병사의 공격력과 방어력은 같아야 한다.)*/
public class Marine {
    int x = 0, y = 0;   // Marine의 위치좌표
    int hp = 60;        // 현재 체력
    int weapon = 6;     // 공격력
    int armor = 0;      // 방어력

    void weaponUp(){
        weapon++;
    }

    void armorUp(){
        armor++;
    }

    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

}

// weapon, armor
// 모든 병사의 공격력과 방어력이 같아야하므로, 공유되어야 함 (static 변수가 되어야 함)