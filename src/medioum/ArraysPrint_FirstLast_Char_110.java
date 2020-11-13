package medioum;
import java.util.*;
public class ArraysPrint_FirstLast_Char_110 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};
      /*
        //First way:
        for (int i = 0; i<=words.length - 1; i++){

           String eachWord  =words[i];
           String result = eachWord.substring(0,1)+eachWord.substring(eachWord.length()-1);
            System.out.println(result);

        }
*/
        for (int i = 0; i<=words.length - 1; i++){


            String eachWord = words[i].substring(0,1)+words[i].substring(words[i].length()-1);
            System.out.println(eachWord);

        }
    }
}
/*
Given a String array words, iterate through each word and print first and last letter of each element in separate lines.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print:
       ho
       wy
       by
       ae
       ne

 */