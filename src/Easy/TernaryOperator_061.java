package Easy;
import java.util.Scanner;
public class TernaryOperator_061 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number1:");
        int num1 = scan.nextInt();


        System.out.println("Enter number2:");
        int num2 = scan.nextInt();

        int greaterNum = 0;

        greaterNum = (num1>=num2)? num1 : num2;

        System.out.println(greaterNum);
    }
}
