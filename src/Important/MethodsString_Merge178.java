package Important;

public class MethodsString_Merge178 {

    public static void main(String[] args) {
        String s1 ="12345";
        String s2 = "abcdeaaaa";

        System.out.println(mergeStrings(s1,s2));

    }

    public static String mergeStrings(String one, String two) {



        String result = "";



        int minLength = (one.length() >= two.length())? two.length() :one.length();

        for(int i= 0; i<=minLength-1; i++){
            result += ""+ one.charAt(i) + two.charAt(i);
        }
        result += one.substring(minLength);
        result += two.substring(minLength);

        return result;

    }
}
/*
When gears merge and work together, one teeth from each one goes in order.
Write a method mergeStrings hat will return the strings merged, one letter at a time, starting with one.
  Please note one and two can be of different lengths. Please look at below examples:

s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"

mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

mergeStrings("java", "selenium") ==> "jsaevlaenium"
 */