package InterView_Codes;
import java.util.*;

public class Methods_PrintUniqueWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);   //only declare array size and elements by scanner
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }


        printUniqueWords(words);
    }


    public static void printUniqueWords(String[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            int count = 0;
            for (String each : arr) {
                if (arr[i].equals(each)) {
                    count++;
                }

            }
            if (count == 1) {
                System.out.println(arr[i]);
            }


        }
    }
}
/*
Complete a void method printUniqueWords() that will print only unique words from an array of strings.
 Every single unique word should be printed from the new line.

Example:
input:[java, code, python, code, rust, code, rust]
output:
java
python
 */