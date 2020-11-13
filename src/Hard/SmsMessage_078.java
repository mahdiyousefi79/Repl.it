package Hard;

import java.util.Scanner;

public class SmsMessage_078 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter message:");
        String message = scan.nextLine();

        String sender, phoneNumber, messageBody;
        int o1, c1, o2, c2, o3, c3;

        o1 = message.indexOf("<");
        c1 = message.indexOf(">");
        o2 = message.indexOf("[");
        c2 = message.indexOf("]");
        o3 = message.indexOf("{");
        c3 = message.indexOf("}");

        sender = message.substring(o1 + 1, c1);
        phoneNumber = message.substring(o2 + 1, c2);
        messageBody = message.substring(o3 + 1, c3);

        System.out.println("Sender: " + sender);
        System.out.println("PhoneNumber: " + phoneNumber);
        System.out.println("Message body: " + messageBody);
    }
}
/*
We have a message variable already declared and assigned value in this format:

Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}

print information like blew:

Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programing and problem solving
 */