package lexicon.student.TonNgu;

import com.sun.org.apache.xerces.internal.impl.XMLEntityScanner;

import java.util.Scanner

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in)
        System.out.println("Console Calculator App");
        System.out.println("Input the first number:");
        double n1 = scanner.nextDouble();
        System.out.println("Input the second number:");
        double n2 = scanner.nextDouble();
        System.out.println("Choose operation type, enter number:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

    }
}
