package Important;
import java.util.*;
public class Method_ArrayList_Swap {

    public static ArrayList<String> swap(ArrayList<String> list  ,int pos1 , int pos2) {

      Collections.swap(list,pos1,pos2);

       return list;

    }




}
/*
In this assignment you will swap a position in an array list with another.

swap gets 3 arguments, an arraylist, a position, and another position to swap with.

for example:

swap(["one","two","three"],0,2)
returns:["three","two","one"]


swap(["a","c","b","d","e"],0,3)
returns:["d","c","b","a","e"]

 */