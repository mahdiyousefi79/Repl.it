package medioum;

import java.util.*;

public class PrintVowels_106 {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");

        String word = inp.nextLine();
        String vowelLetters ="";
        for (int i=0; i<=word.length()-1; i++){

            char eachLetter = word.charAt(i);

          if (eachLetter=='a' ||eachLetter=='e' || eachLetter=='o' || eachLetter=='i' || eachLetter=='u') {

              vowelLetters +=eachLetter;

          }


        }

        System.out.println(vowelLetters);


    }
}
/*
Inputs:
String word;

Write a for loop that will loop through every letter of the input and print out just the vowels. Sample input/outputs
In: howdyho
oo

In: huehuehuehue
ueueueue

In: poopoo what idk what im doing
ooooaiaioi
 */