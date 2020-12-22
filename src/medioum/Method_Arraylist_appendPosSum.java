package medioum;

import java.util.ArrayList;

public class Method_Arraylist_appendPosSum {

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list){


       list.removeIf(   p-> p<1) ;
        Integer sum=0;
        for (Integer each: list){
            sum+= each;
        }
        list.add(sum);
        return list;
    }


}
/*
Create a static method that:

is called appendPosSum
returns an ArrayList of Integers
takes one parameter: an ArrayList of Integers

This method should:
Create a new ArrayList of Integers
Add only the positive Integers to the new ArrayList
Sum the positive Integers in the new ArrayList and add the Sum as the last element

For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3), the ArrayList that gets returned should be
(4,3,4,3,14), with 14 being the sum of (4,3,4,3).  The original ArrayList should remain unchanged.


(4,-6,3,-8,0,4,3) --------> (4,3,4,3,Sum)-------->(4,3,4,3,14)
 */