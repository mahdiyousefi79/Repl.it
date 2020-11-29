package InterView_Codes;

public class ReverseString {
    public static void main(String[] args) {
        String str = "abcdefgh";
        reverse(str);
    }




    public static void reverse(String word) {
        String result = "";
        char[] arr = word.toCharArray();

        for (int i = word.length() - 1; i >= 0; i--) {

            result += arr[i];

        }
        System.out.println(result);

        System.out.println("===========================================");


        /*
        Second way : use charAt() instead of convert it to Array
        public static void reverse(String word){
        String result = "";

        for(int i = word.length()-1; i>= 0; i--){
            result += word.charAt(i);
        }

        System.out.println(result);
    }
         */

    }
}