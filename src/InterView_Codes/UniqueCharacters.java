package InterView_Codes;

public class UniqueCharacters {

    public static void main(String[] args) {



        String str = "abbbcfgggcxccxgggr";

        String unique="";

        for (int j=0;j<=str.length()-1;j++) {


            int frequency = 0;


            for (int i = 0; i <= str.length() - 1; i++) {

                if (str.charAt(j) == str.charAt(i)) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                unique += str.charAt(j);

            }

        }





        System.out.println(unique);


    }
}
