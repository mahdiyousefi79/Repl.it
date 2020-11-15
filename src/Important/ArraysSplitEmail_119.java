package Important;

import java.util.*;

public class ArraysSplitEmail_119 {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        //  String email = input.nextLine();

        String email = "info@cybertekschool.com";
/*
  :
       // if (email.contains("@")){
        }else {
          System.out.println("invalid email");

      }

       */

        // ****************** First Way ***********************************************
        String[] arr = email.split("@");

        System.out.println(Arrays.toString(arr)); //[info, cybertekschool.com]

        if (arr.length == 2) {

            System.out.println("Email id: " + arr[0]);
            System.out.println("Email domain: " + arr[1]);

        } else {
            System.out.println("invalid email");
        }
        System.out.println("===================================================");

        // ****************************** Second way*****************************************

        if (email.contains("@")) {
            String id = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@") + 1);
            System.out.println("Email id: " + id);
            System.out.println("Email domain: " + domain);

        } else {
            System.out.println("invalid email");
        }
    }
}
/*
Given a String variable email, write code using split method to print email id and domain in separate lines.

Example:
email -> info@cybertekschool.com
Print:
Email id: info
Email domain: cybertekschool.com


If email contains no @ character or multiple @ characters then print invalid email:

email -> hello-gmail.com
print:
invalid email

email -> my@fancy@email.com
print:
invalid email
 */