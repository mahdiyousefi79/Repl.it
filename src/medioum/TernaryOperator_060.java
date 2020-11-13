package medioum;

import java.util.*;
public class TernaryOperator_060 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scan.nextInt();
        //WRITE YOUT CODE HERE:

        String y= "";
        y= (x>=5) ? " "  : "-";

        System.out.println(y+x);

    }
}
/*
Write an expression using the conditional operator
 (? :) that compares the value of the variable x to 5 and results in:
Display x if x is greater than or equal to 5
Display -x if x is less than 5

 */