package Hard;
import com.sun.org.apache.xalan.internal.xsltc.dom.SortingIterator;

import java.util.Scanner;
public class SecondConvertor_032 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int allSeconds = scan.nextInt();
        int second = allSeconds % 60;
        int a = allSeconds / 60;
        int minute = a % 60;
        int hour = allSeconds / 3600;
        System.out.print( hour + ":" + minute + ":" + second);
        System.out.print("\n");
    }
}
/*
Write a program that outputs the number of hours, minutes, and seconds that
corresponds to input total seconds.

-create a Scanner object
- declare int variables inputSeconds, hours, minutes, seconds
-Ask user enter seconds by printing:
"Enter seconds:"

-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
-Assign values to the hours, minutes, seconds variables
-Display the result.

Example run:
Enter seconds:
3695
1 hours, 1 minutes, and 35 seconds
 */