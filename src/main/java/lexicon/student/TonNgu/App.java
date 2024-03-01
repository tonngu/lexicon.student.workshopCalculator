package lexicon.student.TonNgu;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean goAgain = true
        while (goAgain = true) {
            System.out.println("Console Calculator App");
            System.out.println("Choose one of the following operation type, enter number:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Terminate Application");
            int operationChoice = scanner.nextInt();
            if (operationChoice = 5) {
            goAgain = false};
            System.out.println("Input the first number:");
            double n1 = scanner.nextDouble();
            System.out.println("Input the second number:");
            double n2 = scanner.nextDouble();

                
            }
        System.out.println("Application Terminated.");
        }
    }
}
