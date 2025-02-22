package test.practice2.chap07;

class MyTv2 {
    boolean isPoweron;
    private int channel;
    private int volume;

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
        this.channel = channel;
    }

    // 정답
}

class Ex10 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH : " + t.getChannel());
        t.setVolume(20);
        System.out.println("VOL : "+t.getVolume());
    }
}
