package medioum;
import java.util.*;
public class Arrays_ShiftLeft_130 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        int[] numsShifted = new int[size];

        for (int i=0; i< numsShifted.length-1;i++){
            numsShifted [i]=nums[i+1];
        }
            numsShifted [nums.length-1] =nums[0];

        System.out.println(Arrays.toString(numsShifted));
    }
}
/*
Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}. You may modify and print the given array, or print a new array.
Example:
input: 6, 2, 5, 3
output: [2, 5, 3, 6]
 */