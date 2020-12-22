package OOP.LameCalculator;

public class LameCalculatorObjects {

    public static void main(String[] args) {

        LameCalculator lc = new LameCalculator();     // this one is create object then it means we need instance method in main file to call it .

        System.out.println("1+1 = "+lc.plus(1,1));          // calls method through the object
        System.out.println("2-3 = "+lc.minus(2,3));
        System.out.println("2x3 = "+lc.multiply(2,3));
        System.out.println("10:2 = "+lc.divide(10,2));

    }
}
