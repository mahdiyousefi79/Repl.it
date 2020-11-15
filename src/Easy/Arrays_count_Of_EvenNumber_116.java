package Easy;

import java.util.*;

public class Arrays_count_Of_EvenNumber_116 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nums = new int[10]; // Declare Array length


        for(int i = 0 ; i<=9 ; i ++) {
            nums[i] = input.nextInt();
        }

        int evenNumCount = 0;  //temporary

        for (int each: nums ){

            if (each%2==0){
                evenNumCount++;
            }

        }
        System.out.println(evenNumCount);
    }
}
/*
Given an array nums, calculate the count of even numbers in nums and print out to console.

nums → [2, 1, 2, 2, 1, 2,  3,  4, 3, 4]) → 6
nums → [2, 2, 5, 7, 9, 0,  3,  5, 2, 2]) → 5
nums → [1, 1,21,21,25,13, 17, 29, 11,3])  → 0
 */