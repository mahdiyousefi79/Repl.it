package OOP.CodesWroteSameClass;

public class GasTank {

    public double amount = 0, capacity;

    public GasTank(double capacity) {
        this.capacity = capacity;
    }

    public void addGas(double newAmount) {

        amount += newAmount;                                // we can use this.amount += amount
        if (amount > capacity) {
            amount = capacity;
        }
    }

    public void useGas(double newAmount) {

        amount -= newAmount;
        if (amount < 0) {
            amount = 0;
        }

    }

    public Boolean isEmpty() {
        return (amount < 0.1) ? true : false;

    }

    public Boolean isFull() {
        return (amount > (capacity - 0.1)) ? true : false;

    }

    public double getGasLevel() {
        return amount;
    }

    public double fillUp() {
        return capacity - amount;
    }

    @Override
    public String toString() {
        return "GasTank{" +
                "amount=" + amount +
                ", capacity=" + capacity +
                '}';
    }
}


     class  GasTankObject {
         public static void main(String[] args) {



         GasTank gt = new GasTank(20);
             System.out.println(gt);              // GasTank{amount=0.0, capacity=20.0}

            gt.addGas(10);            // GasTank{amount=10.0, capacity=20.0}
             System.out.println(gt);


             gt.addGas(18);
             System.out.println(gt);             // GasTank{amount=20.0, capacity=20.0}



             gt.useGas(15);
             System.out.println(gt);             // GasTank{amount=5.0, capacity=20.0}


             System.out.println(gt.isFull());     // false


             System.out.println(gt.fillUp());     //15.0

     }

     }
/*
Write a class named GasTank containing:
An instance variable named amount of type double, initialized to 0.

An instance variable named capacity of type double.
A constructor that accepts a parameter of type double. The value of the parameter is used to initialize the value of capacity.


A method named addGas that accepts a parameter of type double.
The value of the amount instance variable is increased by the value of the parameter.
 However, if the value of amount is increased beyond the value of capacity, amount is set to capacity.

A method named useGas that accepts a parameter of type double.
 The value of the amount instance variable is decreased by the value of the parameter.
 However, if the value of amount is decreased below 0, amount is set to 0.


A method named isEmpty that accepts no parameters. isEmpty returns a boolean value: true if the value of amount is less than 0.1, and false otherwise.

A method named isFull that accepts no parameters. isFull returns a boolean value: true if the value of amount is greater than capacity-0.1, and false otherwise.

A method named getGasLevel that accepts no parameters. getGasLevel returns the value of the amount instance variable.

A method named fillUp that accepts no parameters.

fillUp increases amount to capacity and returns the difference between the value of
capacity and the original value of amount (that is, the amount of gas that is needed to fill the tank to capacity).
 */