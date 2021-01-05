package medioum;

import java.util.ArrayList;
import java.util.Arrays;

public class Methods_ArrayList_2Times {

    public static ArrayList<Integer> twoTimes(ArrayList<Integer> list) {

        ArrayList<Integer> newList = new ArrayList<>();

        for (Integer each : list) {

        //   newList.addAll(Arrays.asList(each,each));

         newList.add(each);
         newList.add(each);



        }

        return newList;

    }


    public static void main(String[] args) {

        Integer[] arr = {1, 5, 3, 7};

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println(list);

        list = twoTimes(list);
        System.out.println(list);
    }

}
/*
Create a method that:

is called twoTimes
returns a new ArrayList of Integers
takes in a single parameter - an ArrayList of Integers

This method should create a new ArrayList of Integers that contains every value of the ArrayList parameter repeated twice.

For example, if the parameter is
(1,5,3,7)
The method should return a new ArrayList of Integers with
(1,1,5,5,3,3,7,7)
 */