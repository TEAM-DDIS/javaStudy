package W02.chap07;

class Product{
    int price;          // 제품의 가격
    int bonusPoint;     // 제품구매 시 제공하는 보너스 점수

    public Product() {}

    Product(int price){
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv extends Product{
    Tv() {}
    // 여기에서 에러 발생.
    // 부모 클래스에서 기본 생성자를 만들어 주면 상속받은 자식 클래스의 기본 생성자에 super();이 자동적으로 생성됨.

    public String toString() {
        return "Tv";
    }

}


public class E7_5 {

    public static void main(String[] args) {
        Tv t = new Tv();

    }
}
