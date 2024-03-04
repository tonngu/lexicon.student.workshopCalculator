package lexicon.student.TonNgu;

import java.util.Scanner;

public class Methods {
    public static int welcome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Console Calculator App");
        System.out.println("Choose one of the following operation type, enter number:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Terminate Application");
        return sc.nextInt();
    }

    public static void addition() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input total amount of numbers you want to add:");
            int additionOperands = sc.nextInt();
            System.out.println("Input the first number:");
            double addresult = 0;
            for (int i = 0; i < additionOperands; i++) {
                System.out.println("Input next number:");
                addresult += sc.nextDouble();
                System.out.println("Result: " + addresult);
            }

        } catch (Exception e) {
            System.out.println("Only Integers and Rational numbers are valid inputs.");
        }
    }

    public static void subtraction() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input total amount of operands for subtraction:");
            int subOperands = sc.nextInt();
            System.out.println("Input the first number to be subtracted from:");
            double subresult = sc.nextDouble();
            for (int i = 0; i < subOperands; i++) {
                System.out.println("Input next number:");
                subresult -= sc.nextDouble();
                System.out.println("Result: " + subresult);
            }
        } catch (Exception e) {
            System.out.println("Only Integers and Rational numbers are valid inputs.");
        }
    }

    public static void multiplication() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input the first number:");
            double n1 = sc.nextDouble();
            System.out.println("Input the second number:");
            double n2 = sc.nextDouble();
            System.out.println("The result is: " + (n1 * n2));
        } catch (Exception e) {
            System.out.println("Only Integers and Rational numbers are valid inputs.");
        }
    }

    public static void division() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input the first number:");
            double n3 = sc.nextDouble();
            System.out.println("Input the second number:");
            double n4 = sc.nextDouble();
            System.out.println("The result is: " + (n3 / n4));
        } catch (Exception e) {
            System.out.println("Only Integers and Rational numbers are valid inputs.");
        }
    }

}
