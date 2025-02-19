package StudyJava.chap07;

import java.util.Arrays;

public class Ex7_19 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());
        b.summary();

    }
}
class Buyer {
    int money = 1000;
    Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
    int i = 0; // Product cart index 배열 에 사용될
    void buy(Product p) {
        if(money <= p.price){
            System.out.println("잔액이 부족하여" + p + "를 살수 없습니다.");
        } else{
            money = money - p.price;
            add(p);
        }
    }
    void add(Product p) {
        if (cart.length <= i){
            Product[] newcart = Arrays.copyOf(cart, cart.length*2);
            cart = newcart;
        }

        cart[i] = p;
        i++;

    }
    void summary() {
        int sum = 0;
        System.out.print("구입한 물건:");
        for (int j = 0; j < cart.length; j++) {
            System.out.print(cart[j]);
            sum = sum + cart[j].price;
        }
        System.out.println();
        System.out.println("사용한 금액:" + sum);
        System.out.println("남은 금액:" + money);

/*
(3) . 아래의 로직에 맞게 코드를 작성하시오
1.1 . 장바구니에 담긴 물건들의 목록을 만들어 출력한다
1.2 . 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다
1.3 (money) . 물건을 사고 남은 금액 를 출력한다
*/
    } // summary()
}
class Product {
    int price; // 제품의 가격
    Product(int price) {
        this.price = price;
    }
}
class Tv extends Product {
    Tv() { super(100); }
    public String toString() { return "Tv"; }
}
class Computer extends Product {
    Computer() { super(200); }
    public String toString() { return "Computer";}
}
class Audio extends Product {
    Audio() { super(50); }
    public String toString() { return "Audio"; }
}

