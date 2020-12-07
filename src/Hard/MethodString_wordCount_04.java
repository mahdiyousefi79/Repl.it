package Hard;

import java.util.Arrays;
import java.util.Scanner;

public class MethodString_wordCount_04 {
    public static void main(String[] args) {
        String str = "one two three four five";
        System.out.println(wordCount(str));


    }

    //-----------------firs way----------------------------
    /*
      public static int wordCount1(String str) {
        int countOfWord = 0;
               String[] arr = str.split(" ");
              return countOfWord =arr.length;
*/
    //-------------------------second way -----------------


    public static int wordCount(String words) {

        words = words.trim();

        int countSpace = 0;
        for (int i = 0; i <= words.length() - 1; i++) {
            if (words.charAt(i) == ' ') {
                countSpace++;
            }
        }
        return countSpace + 1;


    }
}
/*
This method gets a string and returns the word count of that string.

example:

wordCount("foo bar")
returns 2

wordCount("one two three")
returns 3

wordCount("bla")
returns 1

hint:

https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String)
 */