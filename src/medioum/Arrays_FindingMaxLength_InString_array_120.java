package medioum;

import java.util.*;

public class Arrays_FindingMaxLength_InString_array_120 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        String[] words = new String[5]; // Declare array length

        for (int i = 0; i < 5; i++) {

            words[i] = input.nextLine();
        }

        int max = words[0].length();

        String maxEach = "";


        for (String each : words) {
            if (each.length() > max) {

                max = each.length();

                maxEach = each;

            }
        }
        System.out.println(maxEach);

    }
}
/*
Given the array words, it will print the word with the largest length. Assume that there are no 2 words with longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa
 */