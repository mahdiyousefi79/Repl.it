package Easy;
import java.util.*;
public class Arrays_Reverse_Sentence_137 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String[] arr = sentence.split(" ");

        for (int i= arr.length-1; i>=0;  i--) {
            System.out.println(arr[i]);

        }
    }
}
/*
Given a String variable sentence, write code to type each word in separate lines in a reverse order.
Example:
sentence -> "Java is fun"
Print
fun
is
Java
 */