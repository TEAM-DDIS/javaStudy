package com.study.chap07;

/* 7-10. MyTv2 클래스의 멤버변수를 외부에서 접근할 수 없도록 제어자를 붙이고
*        getter와 setter 메서드를 추가하라. */
class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volumne;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUMN = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolumne() {
        return volumne;
    }

    public void setVolumne(int volumne) {
        this.volumne = volumne;
    }
}

public class Ex10 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH: " + t.getChannel());
        t.setVolumne(20);
        System.out.println("VOL: " + t.getVolumne());
    }
}

// CH: 10
// VOL: 20