package test.practice2.chap07;

class Product
{
    int price;          // 제품의 가격
    int bonusPoint;     // 제품구매 시 제공하는 보너스점수

    Product(){}        // 정답

    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv extends Product{
    Tv() {}

    public String toString(){
        return "Tv";
    }
}

class Ex02 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}

/* 설명.
*   자식 클래스의 객체를 생성할때, 자동으로 부모클래스의 생성자도 호출이 되어야함.
*   원래는 기본 생성자 메소드는 추가하지 않아도 정의되어 있지만, Product 클래스에
*   이미 Product(int price)라는 메소드가 정의되어 있으므로 자동으로 추가 불가능.
*   따라서 정답과 같은 기본 생성자 메소드를 추가해줘야한다.*/
