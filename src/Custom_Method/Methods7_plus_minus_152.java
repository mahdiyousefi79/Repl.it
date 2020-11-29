package Custom_Method;

import java.util.Scanner;

public class Methods7_plus_minus_152 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {

            arr[i] = inp.nextInt();
        }


        plus_minus(arr);


    }

    public static void plus_minus(int[] arr) {

        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;

        for (int each : arr) {

            if (each > 0) {
                countPositive++;
            } else if (each < 0) {
                countNegative++;
            } else {
                countZero++;
            }
        }
        System.out.println("positives: " + countPositive + " negatives: " + countNegative + " zeros: " + countZero);

    }
}

/*
Create a method called plus_minus that gets an array of ints (int[]), it outputs how many negative , positive and zero numbers are in the array.

for example:

plus_minus (new int[]{1,2,55,-9,-2,0});

will output:
positives:3, negatives:2, zeros:1
 */