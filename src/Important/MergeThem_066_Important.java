package Important;

import java.util.Scanner;
public class MergeThem_066_Important {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word1 = scan.next();
        String word2 = scan.next();
        scan.close();
        String result = " ";
        if (word1.length() != 3 || word2.length() != 3) {
            System.out.println("cannot merge");
        } else {

            for (int i = 1; i <= 3; i++) {
                result =""+word1.charAt(0)+word2.charAt(0);
                result +=""+ word1.charAt(1)+word2.charAt(1);
                result +=""+ word1.charAt(2)+word2.charAt(2);

            }
        }
        System.out.println(result);
    }
}
 /*

        System.out.println("===============================");
        if(word1.length()==3 && word2.length()==3){
            System.out.println(""+word1.charAt(0)+word2.charAt(0)+word1.charAt(1)+word2.charAt(1)+word1.charAt(2)+word2.charAt(2));
        }else{
            System.out.println("cannot merge");
        }
*/


/*
You have 2 words, both of them have 3 characters.
If either of them does not have exactly 3 characters, print "cannot merge"
Merge their characters one by one and print together like below:

aok
lol
alookl

ear
pie
epaire

java
wow
cannot merge

hint:
by inserting +""+ (empty string) between chars, you can concatenate char values
 */