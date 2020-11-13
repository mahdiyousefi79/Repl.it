package Important;

import java.util.*;

public class Tip_Calculator_051 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalTOPay = 0;
        double totalTip = 0;
        String symboleNumPeople = "";

        System.out.println("Do you want to split?");
        String answerForSplit = scan.next();
        while (!(answerForSplit.equalsIgnoreCase("yes") || answerForSplit.equalsIgnoreCase("no"))) {
            System.out.println("Invalid Entry, please re-enter");
            answerForSplit = scan.next();

        }

        System.out.println("Enter total amount");
        double totalAmount = scan.nextDouble();

        System.out.println("Enter number of people");
        int numberOfPeople = scan.nextInt();

        System.out.println("Enter service quality");
        String serviceQuality = scan.next().toLowerCase();

        while (!(serviceQuality.equalsIgnoreCase("poor")||serviceQuality.equalsIgnoreCase("fair")||serviceQuality.equalsIgnoreCase("good")
        || serviceQuality.equalsIgnoreCase("great")||serviceQuality.equalsIgnoreCase("excellent"))) {

            System.out.println("Service quality is invalid please reEnter ");
            serviceQuality = scan.next().toLowerCase();
        }
        switch (serviceQuality) {
            case "poor":
                totalTip = 0.05 * totalAmount;
                break;
            case "fair":
                totalTip = 0.10 * totalAmount;
                break;
            case "good":
                totalTip = 0.15 * totalAmount;
                break;
            case "great":
                totalTip = 0.20 * totalAmount;
                break;
            case "excellent":
                totalTip = 0.25 * totalAmount;
                break;
            default:




        }


        if (answerForSplit.equalsIgnoreCase("yes")) {

            for (int i = 1; i <= numberOfPeople; i++) {
                symboleNumPeople += "&";
            }

            System.out.println("Number of people entered: " + symboleNumPeople);
            System.out.println("Total to pay: " + (totalAmount + totalTip));
            System.out.println("Total tip: " + totalTip);
            System.out.println("Total per person: " + ((totalAmount + totalTip)) / 4);
            System.out.println("Tip per person: " + (totalTip / 4));
        } else {
            System.out.println("Total to pay: " + (totalAmount + totalTip));
        }
    }
}
/*
Write your code inside the method.
Use the values given as method parameters.
Assign final values.
Then user should select service quality that will correspond to tip percent.
Poor = 5%
Fair = 10%
Good = 15%
Great = 20%
Excellent = 25%
The program should display the following information based on the user input:
Split or No split
Number of people entered: &&&&
Service Quality:
Total to pay:
Total tip:
Total per person:
Tip per person:
https://itunes.apple.com/us/app/ihandy-tip-calculator/id324501526?mt=8

Input:
Split:Yes
Number of people:4
Check amount:476.0
Service Quality:Excellent

Output:

Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0                -----> 476 * 25% = 119
Total per person: 148.75        -----> 595 / 4 = 148.75
Tip per person: 29.75           -----> 119 /4 =  29.75
 */