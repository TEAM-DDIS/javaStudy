package test.practice2.chap07;

class MyTv3 {
    boolean isPoweron;
    private int channel;
    private int volume;
    private int previousChannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    // 정답

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setChannel(int channel){
        previousChannel = this.channel;
        this.channel = channel;
    }

    public void gotoPrevChannel(){
        setChannel(previousChannel);
    }

    // 정답
}

class Ex11 {
    public static void main(String[] args) {
        MyTv3 t = new MyTv3();

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
