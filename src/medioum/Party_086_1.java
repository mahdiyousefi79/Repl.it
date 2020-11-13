package medioum;

import java.util.*;

public class Party_086_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter guest name:");
        String guestList = input.nextLine();


        for (int i = 1; i > 0; ) {   //every time this loop is correct
            System.out.println("Do you want to enter new guest name:");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Please enter guest name:");
                guestList += ", " + input.nextLine();

            } else {
                System.out.println("Guest's list: " + guestList);
                break;

            }
        }


    }
}
/*
Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
Ask for the first guest name.
Then ask does user want to enter one more guest.
 If yes - take input from.
If not - finish the program and print list of the guests.

Example of the program:

Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no

Guest's list: Nick, Linda
 */