package OOP.CodesWroteSameClass;

public class Telephone {
    public String number;

    public static int quantity;
    public static double total;

    static {
        quantity = 250;
        total = 15658.92;

    }
/*

    public Telephone(String number) {         because we must create set Number then we don't need to create constructor
        this.number = number;
    }
*/

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "number='" + number + '\'' +
                '}';
    }
}

//------------------------------------------------------------------------------------
class TelephonObjects {
    public static void main(String[] args) {


        Telephone t = new Telephone();  // its using default constructor that compiler made it by default

        System.out.println(t.getNumber());  // null

        t.setNumber("09143153142");

        System.out.println(t);   //Telephone{number='09143153142'}
    }
}





/*
Write the definition of a class Telephone.
The class has one instance variable of type String called number, and two public static variables.
One is of type int called quantity, initialized to 250;
the other is of type double called total, initialized to 15658.92
Create getNumber() method that returns the number and setNumber() method that sets the instance variable number
 */