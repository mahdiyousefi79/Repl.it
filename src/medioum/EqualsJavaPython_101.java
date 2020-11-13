package medioum;

import java.util.Scanner;

public class EqualsJavaPython_101 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String sentence = scan.nextLine().toLowerCase();

        String word1 = "java";
        String word2 = "python";
        int countWord1= 0;
        int countWord2 =0;

     while (sentence.contains(word1) ){

         sentence = sentence.replaceFirst(word1,"");
              countWord1++;
     }



        while (sentence.contains(word2) ){

            sentence = sentence.replaceFirst(word2,"");
            countWord2++;
        }


       boolean result = countWord1==countWord2;
        System.out.println(result);

    }
}
/*
Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).
Example:
input: We study java not python
output: true

Example:
input: What's the difference between java, javascript and python?
output: false
 */