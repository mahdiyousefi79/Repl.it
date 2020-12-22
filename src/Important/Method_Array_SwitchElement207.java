package Important;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Method_Array_SwitchElement207 {

// ---------------------- first way with Array list -----------------------------
    public static int[] do_switch(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : arr) list.add(each);

        Collections.swap(list, 0, list.size() - 1);

        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }

// -----------------------Second Way (with over load)----------------------------------------------

    public static double[] do_switch(double[] arr) {

          double temp = arr[0];

          arr[0] = arr[arr.length-1];

          arr[arr.length-1] = temp;


        return arr;
    }






    //-------------------------- check the result --------------------------------------------------

    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3, 4, 5, 6};

        do_switch(arr1);

        System.out.println(Arrays.toString(arr1));

//------------------------------------------------------------------------------------

        double[] arr = {1, 2, 3, 4, 5, 6};

        do_switch(arr);

        System.out.println(Arrays.toString(arr));





    }


}
/*
Switch the last element in an array with the first and return the array.

example:

do_switch([1,2,3,4])
returns:[[4,2,3,1]

do_switch([7,2,3,5])
returns:[5,2,3,7]

 */