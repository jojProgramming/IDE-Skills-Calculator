import java.util.Scanner;

public class Calculator {
    public static void main(String[] args)
    {
        //<editor-fold desc="Initialisation">
        Scanner stdinScanner = new Scanner(System.in);
        Buffer buffer = new Buffer(3);
		buffer.
        //</editor-fold>

        boolean doContinue = true;
        while (doContinue)
        {
            //<editor-fold desc="Ask the user for input">
            System.out.println("The current value held by the calculator is: " + buffer);
            System.out.println();
            System.out.println("What operation do you want to perform?");
            System.out.println("1 - Set value");
            System.out.println("2 - Add to value");
            System.out.println("3 - Subtract from value");
            System.out.println("4 - Multiply value");
            System.out.println("5 - Divide value");
            System.out.println("6 - Quit");

            int choice;
            double operand = 0;

            try{
                choice = stdinScanner.nextInt();

                if (0 < choice && choice < 6) {
                    System.out.println("Please enter a value: ");
                    operand = stdinScanner.nextDouble();
                }
            }
            catch (Exception e) {
                choice = -1;
                stdinScanner.nextLine(); // intentionally discard a line of input so it doesn't get stuck trying to read the same non-numeric input forever
            }

            //</editor-fold>

            if (choice == 1){ // Set value
                buffer = operand;
            }
            else if (choice == 2){ // Add to value
                buffer = add(buffer, operand);
            }
            else if (choice == 3){ // Subtract from value
                buffer = subtract(buffer, operand);
            }
            else if (choice == 4){ // Multiply by value
                //todo (2) Call the multiply function
            }
            else if (choice == 5){ // Divide by value
                //todo (4) Call your divide function
            }
            else if (choice == 6){ // Quit by value
                doContinue = false;
            }
            else{ // If there's a failure
                System.out.println("That is not a valid input!");
            }

        }
    }

    private static double add(double left, double right){
        return left + right;
    }

    private static double subtract(double left, double right){
        //todo (1) Implement subtract function
		
		
		
        return -1;
    }

    private static double multiply(double left, double right){
        return left * right;
    }

    //todo (3) Make a divide function
	
	
}