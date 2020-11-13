package Hard;

import java.util.Scanner;

public class ApartmentLeasing_039 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Cybertek Apartments!");
        System.out.println("Number of bedrooms you are interested:");

        int numberOfBedrooms = scan.nextInt();
        int startingPrice = 0;

        if (numberOfBedrooms >= 1 && numberOfBedrooms <= 3) {

            if (numberOfBedrooms == 1) {
                System.out.println("One Bedroom Selected");
                startingPrice = 1100;
            }

            if (numberOfBedrooms == 2) {
                System.out.println("Two Bedroom Selected");
                startingPrice = 1850;
            }
            if (numberOfBedrooms == 3) {
                System.out.println("Three Bedroom Selected");
                startingPrice = 2550;
            }


        } else {
            System.out.println("No such Bedrooms available");
            startingPrice = 0;
        }

        System.out.println("Starting Price: " + startingPrice);
    }
    }
/*
In this assignment, you will write program for Leasing office.

numberOfBedrooms variable already declared and assigned value using Scanner:
startingPrice is set to 0.

Using Multi Way If statement create this program logic:

numberOfBedrooms is 1
	print "One Bedroom Selected"
	set startingPrice as 1100

numberOfBedrooms is 2
	print "Two Bedroom Selected"
	set startingPrice as 1850

numberOfBedrooms is 3
	print "Three Bedroom Selected"
	set startingPrice as 2550

All other inputs:
	print "No such Bedrooms available"


Print "Starting Price: value"


 */