package W01.chap04;

//import static java.lang.String.UTF16.charAt;

public class E4_13 {
    public static void main(String[]args)
    {
        String value="12o34";
        char ch=' ';
        boolean isNumber=true;
//        반복문과를이용해서문자열의문자를
//        charAt(int i);
//                하나씩읽어서검사한다
        for(int i=0;i<value.length(); i++){
            ch=value.charAt(i);
            if(ch == ' '){

            }

        }
        if(isNumber){

            System.out.println(value+" .");
        }else{
            System.out.println(value+" .");
        }
    }
}
