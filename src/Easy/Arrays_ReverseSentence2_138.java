package Easy;
import java.util.*;
public class Arrays_ReverseSentence2_138 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String sentence = input.nextLine();

        String reversed = "";
        String[] arr = sentence.split(" ");

        for (int i= arr.length-1; i>=0;  i--) {
            if (i > 0) {
                reversed += arr[i] + " ";

            }else {
                reversed += arr[i] ;

            }
        }
        System.out.println(reversed);
    }
}
/*
Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.

Example:
sentence -> "Java is fun"
reversed -> "fun is Java"
 */