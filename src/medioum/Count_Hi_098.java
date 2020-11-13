package medioum;
import java.util.Scanner;


public class Count_Hi_098 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sentence: ");

        String str = scan.nextLine().toLowerCase();
        String word = "hi";
        int count = 0;

        while (str.contains(word)){

            str =str.replaceFirst(word,"");
            count ++;


        }
        System.out.println(count);



    }

}
/*
Print out the number of times that the string "hi" appears anywhere in the given string.
Example:
input: abc hi how hi
output: 2

Example:
input: hi code java please
output: 1

 */