package test.practice2.chap06;

class MyTv {
    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void turnOnOff(){
        // isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
        if (isPowerOn == true) {
            isPowerOn = true;
        }
        else {
            isPowerOn = false;
        }

    }

    void volumeUp(){
        // volume의 값이 MAX_VOLUME보다 작을 때만 값을 1증가시킨다.
        if (volume < MAX_VOLUME) {
            volume++;
        }
    }

    void volumeDown(){
        // volume의 값이 MIN_VOLUME보다 클 때만 값을 1감소시킨다.
        if (volume > MIN_VOLUME) {
            volume--;
        }
    }

    void channelUp() {
        // channel의 값을 1 증가시킨다.
        // 만일 channel이 MAX_CHANNEL이면, channel의 값을 MIN_CHANNEL로 바꾼다.
        if (channel == MAX_CHANNEL) {
            channel = MIN_CHANNEL;
        } else{
            channel++;
        }
    }

    void channelDown() {
        // channel의 값을 1 감소시킨다.
        // 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
        if (channel == MIN_CHANNEL) {
            channel = MAX_CHANNEL;
        } else{
            channel--;
        }
    }


}   // class MyTv

class Ex21 {
    public static void main(String[] args) {
        MyTv t = new MyTv();

        t.channel = 100;
        t.volume = 0;
        System.out.println("CH : " + t.channel +", VOL : " + t.volume );

        t.channelDown();
        t.volumeDown();
        System.out.println("CH:"+t.channel+",VOL:"+t.volume);
        t.volume =100;
        t.channelUp();
        t.volumeUp();
        System.out.println("CH:"+t.channel+",VOL:"+t.volume);

    }
}
