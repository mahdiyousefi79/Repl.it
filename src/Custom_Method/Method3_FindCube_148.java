package Custom_Method;

import java.util.*;

public class Method3_FindCube_148 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
 int n =scan.nextInt();
cube(n);
    }

    public static void cube(int n){
       int cube =n*n*n;
        System.out.println(cube);
    }
}
/*
create a method called cube. Write all required code inside this method in order  to asks the user for a number and then prints the cubed value of that number:

Example:

input: 5
output: 125

hint: cube of a number n = n*n*n
 */