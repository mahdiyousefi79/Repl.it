package Hard;

import java.util.*;

public class Arrays_FindingMaxLength_115 {

    public static void main(String[] args) {


        String[] word = {"aaa", "bbbbb", "whasstupppp", "longg", "jaaaaavvaaaaaaaaaa"};

        int max = word[0].length();
        String longestWord ="";

        for (int i = 0; i <= word.length - 1; i++) {

            if (word[i].length() > max) {

             //   max = word[i].length();
               longestWord = word[i];

            }
        }
        System.out.println(longestWord);





    }

}

/*



Given the array words, it will print the word with the largest length. Assume that there are no 2 words with longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa
 */