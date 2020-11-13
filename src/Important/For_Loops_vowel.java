package Important;
import java.util.Scanner;
public class For_Loops_vowel {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();

        String vowelLetters ="";


        for (int i=0; i<word.length();i++){

          char letter =  word.charAt(i);

          if(letter=='a' || letter=='e' || letter=='o' ||  letter =='u' || letter =='i' ){
                vowelLetters += letter;

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