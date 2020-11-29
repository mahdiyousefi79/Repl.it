package Custom_Method;

import java.util.Scanner;

public class Methods6_signum_151 {
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        sign(n);

    }

    public static void sign(int number) {

        int result = 0;
        result = (number > 0) ? 1 : (number < 0) ? -1 : 0;

        System.out.println(result);
    }
}