import java.util.Scanner;

public class basicCalculator {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Basic Calculator!");
        lineBreak();

        boolean active = true; 

        while (active)
        {
            System.out.print("Please enter your first value: ");
            while(!s.hasNextDouble()) {
                s.next();
                System.out.print("That is not a number! Please try again, enter your first value: ");
            }
            double valueOne = s.nextDouble();
        
            System.out.print("Please enter your second value: ");
            while(!s.hasNextDouble()) {
                s.next();
                System.out.print("That is not a number! Please try again, enter your second value: ");
            }
            double valueTwo = s.nextDouble();
    
            System.out.print("What operation would you like to do (+, -, /, x): ");
            String operation = s.next();
            System.out.println("operation = " + operation); 

            boolean isNotOperation = true; 
            double calculation = 0.0;
            while(isNotOperation) {
                if(operation.equals("+")) {
                    calculation = valueOne + valueTwo;
                    isNotOperation = false; 
                }
                else if (operation.equals("-")) {
                    calculation = valueOne - valueTwo;
                    isNotOperation = false;
                }
                else if (operation.equals("/")) {
                    calculation = valueOne / valueTwo;
                    isNotOperation = false;
                }
                else if (operation.equals("x") || operation.equals("*")) {
                    calculation = valueOne * valueTwo;
                    isNotOperation = false;
                }
                else {
                    System.out.print("That is not an operation that was mentioned! Enter an operation you would like to do (+, -, /, x): ");
                    operation = s.next();
                    System.out.println("operation = " + operation);
                }
            }
            
            System.out.println(boxText("The final calculation is: " + calculation + "!"));

            System.out.print("Please enter 'y' to continue (or 'n' to exit): ");
            String cont = s.next();
            boolean inconclusive = true; 
            while(inconclusive) {
                if(cont.equals("y")) {
                    active = true;
                    inconclusive = false;
                }
                else if (cont.equals("n")) {
                    active = false;
                    inconclusive = false;
                }
                else {
                    System.out.print("Try again, pick y/n to continue or exit, respectively: ");
                    cont = s.next();
                }
            }
        }

        lineBreak();
        System.out.println("Thanks for using the Basic Calculator! Goodbye!");
        s.close();
    }

    public static void lineBreak() {
        System.out.println ("\n + ********** + \n");
    }

    public static String boxText(String s) {
        String horizontal = " ";
        String vertical = "|";
        for(int i = 0; i < s.length() + 1; i++)
        {
            horizontal = horizontal + "-";
            vertical = vertical + " ";
        }
        horizontal = horizontal + "\n";

        return horizontal + "|" + s + "|\n" + horizontal;
    }
}
