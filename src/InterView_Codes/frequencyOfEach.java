package InterView_Codes;

import library.StringUtility;

public class frequencyOfEach {
    public static void main(String[] args) {

        String str = "aaabbc";

        String expectedResult ="";
        for(int j = 0; j <= str.length()-1; j++){

           // char ch = str.charAt(j); //a, a, a, b, b, c
            int frequency = 0;

            for(int i = 0; i<= str.length()-1; i++){ // i represents the index num of str

                if(str.charAt(j) == str.charAt(i) ){
                    frequency++;
                }
            }

            if(!expectedResult.contains(""+str.charAt(j))){
                expectedResult += "" + str.charAt(j) + frequency;
            }
        }

        System.out.println(expectedResult);




    }
}