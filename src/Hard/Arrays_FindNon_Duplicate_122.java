package Hard;

import java.util.*;

public class Arrays_FindNon_Duplicate_122 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //   int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int[] nums = {1, 1, 2, 3, 4, 3, 4};
// ********** first Way *******************************************



        for (int i = 0; i <= nums.length - 1; i++) {

            int count = 0;
            for (int each : nums) {
                if (each == nums[i]) {
                    count++;
                }
            }

            if (count==1){
                System.out.println(nums[i]);
            }
        }
        System.out.println("======================================");
// ********** second Way *******************************************

        for (int element:nums) {

            int count = 0;
            for (int each : nums) {
                if (each == element) {
                    count++;
                }
            }

            if (count==1){
                System.out.println(element);
            }
        }



    }
}
/*
Given an array nums with 7 integers every element is repeated twice - except one. Find that element and print it to console.

Example:

nums -> [1, 1, 2, 3, 4, 3, 4]
         2

 */