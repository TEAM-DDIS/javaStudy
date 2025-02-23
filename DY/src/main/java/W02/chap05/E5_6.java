package W02.chap05;

public class E5_6 {
    public static void main(String[] args) {
        int[] coinUnit = new int[]{500, 100, 50, 10};
        int money = 2680;
        System.out.println("money= " + money);

        for(int i = 0; i < coinUnit.length; ++i) {
            int coin = money / coinUnit[i];
            System.out.println(coinUnit[i] + "원: " + coin);
            money %= coinUnit[i];
        }

    }
}
