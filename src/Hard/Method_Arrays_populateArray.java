package Hard;

import java.util.Arrays;

public class Method_Arrays_populateArray {
    public static int[] populate(int[] r) {

        int[] arr = new int[r.length];
        for (int i = 0; i <= r.length - 1; i++) {

            arr[i] = i + 1;
        }
        return arr;
    }

    public static void main(String[] args) {


        int[] i = new int[3];
        i = populate(i);
        System.out.println(Arrays.toString(i));

    }
}
/*
populate method accepts an empty int array and populates it with numbers counting up.

for example:

populate(new int[3])
returns:[1,2,3]

populate(new int[5])
returns:[1,2,3,4,5]

hint:
use a for loop and use the iterator as the current elements value.
 */