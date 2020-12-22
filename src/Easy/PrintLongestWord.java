package Easy;

import java.util.Scanner;

public class PrintLongestWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word1 = scan.next();
        String word2 = scan.next();

        String longestWord ="";


        longestWord = (word1.length()>word2.length()) ? word1 :word2;

        System.out.println("longestWord = " + longestWord);
    }
}
