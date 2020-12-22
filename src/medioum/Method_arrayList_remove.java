package medioum;

import java.util.ArrayList;

public class Method_arrayList_remove {

    public static void test(ArrayList<Double> dubs) {
      dubs.remove(0);
      dubs.remove(0);
        System.out.println(dubs);

        //------------------- second way------------------------------------
      /*
      double firstElement = doubs.get(0);
      double SecondElement = doubs.get(1);

       doubs.remove(firstElement);
       doubs.remove(secondElement);

       */



    }
}
/*

Write method to remove first and second element of array list.
(6,2,3,1,9,2,5) ------- > (3,1,9,2,5)
As an example, say you had an ArrayList called nums with values (6,2,3,1,9,2,5).  Running the following code:
nums.remove(1);
will result in (6,3,1,9,2,5).  Running the following code again:
nums.remove(3);
nums.remove(3);
will result in (6,3,1,5), because after the first remove(3) is run, the 2 and 5 get pushed up into the 3rd and 4th index,
and then the second remove(3) will remove the 2, leaving the 5.

 */