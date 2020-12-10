package Important;

import java.util.ArrayList;

public class CombineArrays_Return_Arraylist {



    public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2) {

        ArrayList<String> combinedList = new ArrayList<>();

        for (String each : wordList1) {
            combinedList.add(each);
        }

        for (String each : wordList2) {
            combinedList.add(each);
        }



        return combinedList;

    }
    }
/*
Create a static method that:
is called combineAL
returns an ArrayList
takes two parameters: an ArrayList of Strings called wordList1, and an ArrayList of Strings called wordList2

This method should create a new ArrayList of Strings, add all the words (in order) from wordList1, then add all the words (in order) from wordList2.
 In other words, it is combining all the elements from the two parameters.
 */