package StudyJava.chap07;
/*[7-1],[7-2],[7-14]섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck ) 클래스 을 정의한 것이다 섯   .
다카드 20장을 담는 SutdaCard 배열을 초기화하시오 단 섯다카드는1 부터 10까지의 숫자   . ,
가 적힌 카드가 한 쌍씩 있고 숫자가 1,3, 8인 경우에는 둘 중의 한 장은 광(Kwang) 이 ,
어야 한다 즉  SutdaCard 의 인스턴스변수  isKwang 의  값이 true 이어야 한다 . ,.
*/
public class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];
    SutdaDeck() {
        for (int i = 0; i < cards.length; i++) {
            int num = i % 10 + 1;
            boolean isKwang = false;
            if((i == 1 || i == 3 || i == 8 ) && (i < 10)){
                isKwang = true;
            }
            cards[i] = new SutdaCard(num,isKwang);
        }
    }
    public void shuffle(){
        for (int i = 0; i < cards.length; i++) {
            int randomnum = (int)(Math.random()*20);
            SutdaCard temp = cards[i];
            cards[i] = cards[randomnum];
            cards[randomnum] = temp;
        }

    }
    public SutdaCard pick(int index){
        return cards[index];
    }

    public SutdaCard[] pick(){
        int randomnum[] = new int[2];
        for (int i = 0; i < 2; i++) {
            randomnum[i] = (int)(Math.random()*20);

        }
        SutdaCard[] sutdaCards = {randomnum[0], randomnum[1]};
        return sutdaCards;
    }

}




class SutdaCard {
    final int NUM;
    final boolean ISKWANG;

    SutdaCard() {
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang) {
        this.NUM = num;
        this.ISKWANG = isKwang;
    }
    // info() Object toString() . 대신 클래스의 을 오버라이딩했다
    public String toString() {
        return NUM + ( ISKWANG ? "K":"");
    }
}
class Exercise7_1 {
    public static void main(String args[]) {
        SutdaDeck deck = new SutdaDeck();
        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();
        for(int i=0; i < deck.cards.length;i++)
            System.out.print(deck.cards[i]+",");
        System.out.println();
        System.out.println(deck.pick(0));

    }
}


