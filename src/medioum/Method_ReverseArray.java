package medioum;

public class Method_ReverseArray {

    public static String[] reverse(String[] arr){
        String[]  reverseArr = new String[arr.length];

        for (int i= arr.length-1 ,j=0; i>=0; i--, j++){
            reverseArr [j]=arr[i];
        }
        return reverseArr;
    }
}
/*
Write the definition of a method reverse, whose parameter is an array of Strings.
The method reverses the elements of the array. The method returns an array of strings in the reversed order.
Example:
input: ["apple", "pear"]
output: ["pear", "apple"]
 */