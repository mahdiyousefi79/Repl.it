package medioum;

import java.util.*;

public class ArraysPrinting_109 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {

            arr[i] = input.nextLine();
        }

        for (int j=0 ; j<= arr.length-1;j++){

            String word = arr[j].substring(0,3);
            System.out.println(word);
        }

        //second way
        /*
        String s1 = arr[0].substring(0, 3);
        String s2 = arr[1].substring(0, 3);
        String s3 = arr[2].substring(0, 3);
        String s4 = arr[3].substring(0, 3);
        String s5 = arr[4].substring(0, 3);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

         */
    }
}

/*
The code provided in your main method will take in five Strings and save them into an array called arr.
  Print out the first three letters of each element of arr, one per line.  You can assume that every element of arr is at least 3 letters long.

Example:
arr -> ["apple", "banana"]
 prints: app
         ban
Hint: How do you get the first 3 letters of any String starting from index 0 till right before index 3?
 */