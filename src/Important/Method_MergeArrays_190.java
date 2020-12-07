package Important;

import java.util.*;

public class Method_MergeArrays_190 {
    public static void main(String[] args) {


        int[] a = {1, 2, 4, 4};
        int[] b = {11, 12, 13, 14, 15, 16};

          int[]c= mergR(a,b);           //first way
        System.out.println(Arrays.toString(c));
          int[]d= mergR1(a,b);          // second way
        System.out.println(Arrays.toString(d));


    }


    // -------------------------------------first way --------------------------------------
    public static int[] mergR(int[] a, int[] b) {


        int[] z = new int[a.length + b.length];
        int j = 0;
        for (int each : a) {

            z[j++] = each;
        }

        for (int each : b) {

            z[j++] = each;
        }

        return z;

    }


    // ----------------------------------------second way ----------------------------------------------
    public static int[] mergR1(int[] a, int[] b) {


        int[] z1 = new int[a.length + b.length];

        for (int i = 0; i <= a.length - 1; i++) {

            z1[i] = a[i];
        }

        for (int i = 0; i <= b.length - 1; i++) {

            z1[a.length + i] = b[i];
        }

        return z1;

    }
}

/*
mergR merges two arrays into one.
it gets two int arrays and returns an int array

for example:

mergR([1,2,3],[4,5,6])
returns [1,2,3,4,5,6]

mergR([1,2],[6,8])
returns [1,2,6,8]

hint:
create a length int for the combined length of both arrays.
create an array with that length (thats the array we will return).
create an iterator for both arrays (int z=0).

loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
then increment the iterator for both arrays (z++).

do the same for the second array.
 */