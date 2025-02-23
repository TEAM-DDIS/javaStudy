package W02.chap07;

class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 0;

    public MyTv2() {
    }

    public MyTv2(boolean isPowerOn, int channel, int volume, int prevChannel) {
        this.isPowerOn = isPowerOn;
        this.channel = channel;
        this.volume = volume;
        this.prevChannel = prevChannel;
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

        // 현재 채널을 이전 채널에 저장
        this.prevChannel = this.channel;
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPrevChannel() {
        return prevChannel;
    }

    public void setPrevChannel(int prevChannel) {
        this.prevChannel = prevChannel;
    }

    public void gotoPrevChannel() {
        if (this.channel != this.prevChannel) this.setChannel(this.prevChannel);
    }
}


public class E7_10_11 {
    public static void main(String[] args) {

        MyTv2 t = new MyTv2();

        // 10번
//        t.setChannel(10);
//        System.out.println("CH: " + t.getChannel());
//        t.setVolume(20);
//        System.out.println("VOL: " + t.getVolume());

        // 11번
        t.setChannel(10);
        System.out.println("CH: " + t.getChannel());
        t.setChannel(20);
        System.out.println("CH: " + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH: " + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH: " + t.getChannel());



    }
}
