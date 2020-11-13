package medioum;

public class loop_Div3 {
    public static void main(String[] args) {
// first way:
        String result = "";
        for (int i = 1; i <= 20; i++) {

            while (i % 3 == 0) {
                result += i + " ";
                break;
            }

        }

        System.out.println(result);

        System.out.println("======================================================");

//Second way:

        int x = 1;
        while (x <= 20) {

            if (x % 3 == 0) {
                System.out.print(x+" ");

            }

            x++;
        }


    }
}
/*
Write for and while loops so that they print those numbers between 1 and 20 and divisible by 3.
Expected Output:  3 6 9 12 15 18
 */