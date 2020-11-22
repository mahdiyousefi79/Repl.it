package InterView_Codes;

public class frequencyOfEach_Given_Char {
    public static void main(String[] args) {

        String str = "abbbaccccdd";
        char ch = 'a';


        // First Way:
        int frequency = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == ch) {
                frequency++;
            }
        }
        System.out.println("frequency = " + frequency);



        System.out.println("===============================================");

        //second way:
        int frequency1 = 0;
        for (char each:str.toCharArray()){
            if ((each+"").contains(ch+"")){      // we can use  if (each==ch) too
                frequency1++;
            }
        }
        System.out.println("frequency = " + frequency);

    }
}
