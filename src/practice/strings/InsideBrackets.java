package practice.strings;

public class InsideBrackets {

    /**
     *

     Given a string that contains a single pair of brackets, compute a new string made of
     only of the brackets and their contents, so "xyz[abc]123" yields "[abc]".

     <br>
     <br>

     * <b>EXPECTATIONS:</b><br>
     insideBrackets("xyz[abc]123") <b>---></b> [abc]<br>
     insideBrackets("x[hello]") <b>---></b> [hello] <br>
     insideBrackets("[xy]1") <b>---></b> [xy] <br>
     */

public static String insideBrackets(String str){
    System.out.println("Hello world AGAIN!");
    String finalString = "";
    int start = -1;
    int end = -1;
    // YOUR CODE GOES HERE

    for(int index = 0; index < str.length(); index = index + 1){
        if (str.charAt(index) == '['){
            start = index;
        };
        if (str.charAt(index) == ']') {
            end = index + 1;
        }
    }


    finalString = str.substring(start,end);

    return finalString;
}

    public static void main(String args[]){
        System.out.println(insideBrackets("xyz[abc]123"));      // [abc]
        System.out.println(insideBrackets("x[hello]"));         // [hello]
        System.out.println(insideBrackets("[xy]1"));            //[xy]
        System.out.println(insideBrackets("that was an interesting challenge [xyz]1"));            //[xy]
    }

}
