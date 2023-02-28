/**
 * Author: Owen van Mantgem
 */

import java.util.Scanner;

public class Lab006 {

    private int m;
    private int n;

    /**
     * @param n is the number being divided
     * @param m is the number n is being divided by
     */
    public Lab006(int n, int m) {

         // m is the number n is being divided by
        this.m = m;
        // n is the number being divided
        this.n = n;
    }

    /**
     * If n%m leaves no value behind that means n is evenly divisible by m so isDivisible returns true.
     * If a value other than zero is produced n is not evenly divisble by m so isDivisible returns false.
     * @return
     */
    public boolean isDivisible() {
        if (n%m == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Asks user for value to dvide and value to divide by.
     * Creates a new instance of Lab006 with the two values as parameters
     * Uses isDivisible() to check if the first value can be divided by the second and tells the user the result
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number");
        int num1 = scanner.nextInt();

        System.out.println("Please enter the second number");
        int num2 = scanner.nextInt();

        Lab006 newLab = new Lab006(num1,num2);
        if (newLab.isDivisible()) {
            System.out.println(num1 + " is evenly divisible by " + num2);
        }
        else {
            System.out.println(num1 + " is not evenly divisible by " + num2);
        }
    }
}
