package lexicon.student.TonNgu;

import static lexicon.student.TonNgu.Methods.*;


public class App {
    public static void main(String[] args) {
        while (true) {
            int a = welcome(); //calls up choice menu for console based calculator
            if (a == 5) {
                break;
            }
            switch (a) {
                case 1:
                    addition(); //performs addition and asks users to input amount of operands
                    break;
                case 2:
                    subtraction(); //performs subtraction and asks users to input amount of operands
                    break;
                case 3:
                    multiplication(); //performs basic multiplication with 2 operands
                    break;
                case 4:
                    division(); //performs basic division with 2 operands
                    break;
            }
        }
        System.out.println("Application Terminated.");
    }
}

