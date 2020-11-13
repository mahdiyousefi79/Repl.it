package Hard;

import java.util.*;

public class GiftCard_035 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        String item = s.nextLine();
        int price = 0;
        int gift = 100;


        if (item.equalsIgnoreCase("smartphone")) {
            price = 300;

        } else if (item.equalsIgnoreCase("laptop")) {
            price = 400;
        } else if (item.equalsIgnoreCase("charger")) {
            price = 15;

        } else if (item.equalsIgnoreCase("usb cable")) {
            price = 10;
        } else if (item.equalsIgnoreCase("headphones")) {
            price = 30;

        } else if (item.equalsIgnoreCase("pants")) {
            price = 50;

        } else if (item.equalsIgnoreCase("hat")) {
            price = 25;
        } else if (item.equalsIgnoreCase("socks")) {
            price = 5;

        } else if (item.equalsIgnoreCase("Blanket")) {
            price = 60;

        } else if (item.equalsIgnoreCase("pillow")) {
            price = 40;
        } else {


            System.out.println("Invalid item!");
        }

        int balance = gift - price;
        if (balance > 0 && price>0 ) {
            System.out.println("Thank you for your purchase!\nYour current balance is: " + balance + "$");
        } else if (balance < 0 && price>0) {
            System.out.println("Sorry, not enough funds on your gift card!");



    }


}
}
/*
Instructions from your teacher:
Let's say I've got a 100$ gift card and you want to buy something in your online store .
 Write a program that will help me to buy something and display leftover balance after purchase.
  If item is not in the list, display message: "Invalid item!".
   If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
Hint
Use if/ else if / else
CODE EXAMPLE:
Example #1
input: Hat
output: Thank you for your purchase!
output: Your current balance is: 75$

Example #2
input: Pants
output: Thank you for your purchase!
output: Your current balance is: 50$

Example #3
input: Laptop
output: Sorry, not enough funds on your gift card!

Example #4
input: Cupcake
output: Invalid item!
List of items

 */