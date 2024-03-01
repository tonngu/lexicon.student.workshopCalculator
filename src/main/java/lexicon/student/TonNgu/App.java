package lexicon.student.TonNgu;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Console Calculator App");
            System.out.println("Choose one of the following operation type, enter number:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Terminate Application");
            int operationChoice = scanner.nextInt();
            if (operationChoice == 5) {
                break;
            }
            switch (operationChoice) {
                case 1:
                    System.out.println("Input total amount of numbers you want to add:");
                    int additionOperands = scanner.nextInt();
                    System.out.println("Start putting in numbers mf");
                    double addresult = 0;
                    for (int i = 0; i < additionOperands; i++) {
                        addresult = addresult + scanner.nextDouble();
                        System.out.println(addresult);
                    }
                    break;
                case 2:
                    System.out.println("Input total amount of operands for subtraction:");
                    int subOperands = scanner.nextInt();
                    System.out.println("Start putting in numbers mf");
                    double subresult = scanner.nextDouble();
                    for (int i = 0; i < subOperands; i++) {
                        subresult = subresult - scanner.nextDouble();
                        System.out.println(subresult);
                    }
                    break;
                case 3:
                    System.out.println("Input the first number:");
                    double n1 = scanner.nextDouble();
                    System.out.println("Input the second number:");
                    double n2 = scanner.nextDouble();
                    System.out.println("The result is: " + (n1 * n2));
                    break;
                case 4:
                    System.out.println("Input the first number:");
                    double n3 = scanner.nextDouble();
                    System.out.println("Input the second number:");
                    double n4 = scanner.nextDouble();
                    System.out.println("The result is: " + (n3 / n4));
                    break;
            }
        }
        System.out.println("Application Terminated.");
    }
}

