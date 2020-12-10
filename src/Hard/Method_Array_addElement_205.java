package Hard;

import java.util.*;

public class Method_Array_addElement_205 {
    public static void main(String[] args) {


        int[] a = {10, 40, 50, 3, 1};
        int[] b = {20, 2 , 20, 6, 2};

        System.out.println(Arrays.toString( addElements(a,b)));
    }
    public static int[] addElements(int[] ints1, int[] ints2) {

        int[] result = new int[ints1.length];
        for (int i = 0; i <= result.length - 1; i++) {

                result[i] += ints1[i]+ints2[i];

        }
      return result;

    }
}
/*
Method addElements accepts 2 int arrays and adds each element value of two arrays and returns a new array. You can assume that each array has 5 elements

addElements([10, 40, 50, 3, 1], [11, 0, 500, 44, 1101]);
--------
return array after adding values in the arrays:
             [21, 40, 550, 47, 1102]


 */