package Hard;

import java.util.Scanner;

public class FindAUser_59 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter full name:");
        String fullName = scan.nextLine();


        if (fullName.equalsIgnoreCase("Mahdi Yousefi") || (fullName.equalsIgnoreCase("Samira Fekri"))) {

            System.out.println("User found!");


        } else {
            System.out.println("User not found!");
        }


    }

    public static class SmsMessage_078 {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String message = scan.nextLine();
           String sender,phoneNumber,messageBody;
           int o1 ,c1 ,o2,c2,o3,c3;
           o1 = message.indexOf("<");
           c1 =message.indexOf(">");
            o2 =message.indexOf("[");
            c2 =message.indexOf("]");
            o3 =message.indexOf("{");
            c3 =message.indexOf("}");

            sender = message.substring(o1+1,c1);
            phoneNumber = message.substring(o2+1,c2);
            messageBody = message.substring(o3+1,c3);

            System.out.println("Sender:"+sender);
            System.out.println("Phone Number:"+phoneNumber);
            System.out.println("Message body:"+messageBody);

        }
    }
}
/*
Assume that you have only 2 users: Max Payne and Alan Wake.  First, ask user to enter full name.
Display message: "Enter full name:". Then take input from user. If name is equals to either
"Max Payne" or "Alan Wake",  display message: "User found!". Otherwise,  display message:
 "User not found!". Please make your search case insensitive!

Example:
Display message: Enter full name:
input: Max Payne
Display message: User found!
 */