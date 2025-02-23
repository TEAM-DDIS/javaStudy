package W01.chap03;

public class E3_7 {
    public static void main(String[]args){
        int fahrenheit=100;
//        float celcius=(5/9 * (fahrenheit - 32));
        float celcius= ((float) 5/9 * (fahrenheit - 32));

        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.print("Celcius: "+ celcius );
//        System.out.println("Celcius: " + String.format("%.2f",celcius));
    }
}
