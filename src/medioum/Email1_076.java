package medioum;

import java.util.Scanner;

public class  Email1_076 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String email = scan.next();


        if (email.contains("_")) {
            String firstName = email.substring(0, email.indexOf("_"));
            String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@"));




                  email = lastName + "_" + firstName + domain;
    }


        System.out.println(email);

    }
}

/*
In this task, you need to swap first name with last name in the email. If email doesn't contains underscore - do not anything.

Example:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com

Example:
input: barakobama@gmail.com
output: barakobama@gmail.com

 */