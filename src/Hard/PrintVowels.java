package Hard;

import java.util.Scanner;

public class PrintVowels {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

       System.out.print("In:");
       String word = inp.nextLine();

// ---------------------------------------------------------First Way --------------------------------------------------------------------------------------

        String result = "";

        for (String each : word.split("")) {

            if(each.equalsIgnoreCase("a") || each.equalsIgnoreCase("e") || each.equalsIgnoreCase("i") || each.equalsIgnoreCase("o")
                    || each.equalsIgnoreCase("u")) {

                result += each;

            }
        }
        System.out.println(result);


  //------------------------------------------------------------ Second Way ---------------------------------------------------------------------------------------
/*
        String vowel = "aeiou";
        String result = "";

        for(String each : word.split("")) {

            if(vowel.contains(each)) {
                result += each;
            }
        }

        System.out.println(result);

*/







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