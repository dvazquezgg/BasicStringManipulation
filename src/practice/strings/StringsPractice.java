package practice.strings;

public class StringsPractice {

    public static void main(String[] args){

        System.out.println("hello world!");

        String str = "ABCDEFGHIJKLMN";
        String extractedString = str.substring(4,8);

        System.out.println(extractedString);

        if(str.length() == 5) {
            System.out.println("the string length is 5");
        } else {
            System.out.println("the string length is NOT 5");
        }

    }

}
