package com.study.chap07;
/* 7-10. MyTv2 클래스의 멤버변수를 외부에서 접근할 수 없도록 제어자를 붙이고
 *        getter와 setter 메서드를 추가하라. */

class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public MyTv2() {}

    public MyTv2(boolean isPowerOn, int channel, int volume) {
        this.isPowerOn = isPowerOn;
        this.channel = channel;
        this.volume = volume;
    }

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
        prevChannel = this.channel;  // 현재 채널을 prevChannel에 저장
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void gotoPrevChannel() {
        int temp = channel;  // 현재 채널을 임시 저장
        channel = prevChannel;  // 이전 채널로 변경
        prevChannel = temp;  // 현재 채널을 이전 채널로 저장
    }
}



public class Ex10 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH: " + t.getChannel());
        t.setVolume(20);
        System.out.println("VOL: " + t.getVolume());
    }
}

// CH: 10
// VOL: 20


