import java.util.Scanner;

public class Calculator {
    public static void main(String[] args)
    {
        //<editor-fold desc="Initialisation">
        Scanner stdinScanner = new Scanner(System.in);
        Buffer buffer = new Buffer(3);
        //</editor-fold>

        boolean doContinue = true;
        while (doContinue)
        {
            //<editor-fold desc="Ask the user for input" defaultstate="collapsed">
            System.out.println("The buffer currently contains: " + buffer.getValue());
            System.out.println();

			//<editor-fold desc="Handle the mode type selection" defaultstate="collapsed">
			System.out.println("Please select an operation type:");
			System.out.println(" 1 - Simple Operations");
			System.out.println(" 2 - Advanced Operations");
			System.out.println(" 3 - Quit");
			
			boolean simple = true;
			
			try {
				int innerChoice = stdinScanner.nextInt();

				if (innerChoice == 1) { 
					// Do nothing - Simple is already true
				}
				else if (innerChoice == 2) {
					simple = false;
				}
				else if (innerChoice == 3) {
					doContinue = false;
					continue;
				}
				else {
					System.out.println("Invalid choice. Please select a valid option.");
					continue;
				}
			}
			catch (Exception e) {
				stdinScanner.nextLine(); // intentionally discard a line of input so it doesn't get stuck trying to read the same non-numeric input forever
				System.out.println("Invalid choice. Please select a valid option.");
				continue;
			}
			//</editor-fold>

			int choice = -1;
			double operand = 0;
			
			//<editor-fold desc="Handle the simple calculator functions" defaultstate="collapsed">
			if (simple) {
				System.out.println("What operation do you want to perform?");
				System.out.println(" 1 - Set value");
				System.out.println(" 2 - Add to value");
				System.out.println(" 3 - Subtract from value");
				System.out.println(" 4 - Multiply value");
				System.out.println(" 5 - Divide value");

				try {
					choice = stdinScanner.nextInt();

					if (0 < choice && choice < 6) {
						System.out.println("Please enter a value: ");
						operand = stdinScanner.nextDouble();
					}
				} catch (Exception e) {
					stdinScanner.nextLine(); // intentionally discard a line of input so it doesn't get stuck trying to read the same non-numeric input forever
					continue;
				}
			}
            //</editor-fold>

			//<editor-fold desc="Handle the advanced calculator functions" defaultstate="collapsed">
			if (!simple) {
				System.out.println("What operation do you want to perform?");
				System.out.println(" 1 - Logarithm, using the buffer as a base.");
				System.out.println(" 2 - Logarithm, using the operand as a base.");
				System.out.println(" 3 - Exponent, using the buffer as a base.");
				System.out.println(" 4 - Exponent, using the operand as a base.");

				try {
					choice = stdinScanner.nextInt();

					if (0 < choice && choice < 4) {
						System.out.println("Please enter a value: ");
						operand = stdinScanner.nextDouble();
					}
					
				} catch (Exception e) {
					stdinScanner.nextLine(); // intentionally discard a line of input so it doesn't get stuck trying to read the same non-numeric input forever
					continue;
				}
			}
			//</editor-fold>
			//</editor-fold>

			// todo ASHLEY please add functions here that allow use of Multicarat, Viewing Documentation, Control Click to view code source
			// todo ASHLEY note we are now using the Buffer object which is manipulated DIRECTLY by the 
			//  SimpleMathematics class
			
			// Compute the simple operations
			if (simple){
				if (choice == 1){ // Set value
					buffer.setValue(operand);
				}
				else if (choice == 2){ // Add to value
					SimpleMathematics.add(buffer, operand);
				}
				else if (choice == 3){ // Subtract from value
					//todo ASHLEY decide to add the code or leave a todo for students
				}
				else if (choice == 4){ // Multiply by value
//todo ASHLEY decide to add the code or leave a todo for students
				}
				else if (choice == 5){ // Divide by value
//todo ASHLEY decide to add the code or leave a todo for students
				}
				else{ // If there's a failure
					System.out.println("That is not a valid input!");
				}	
            }
			// Handle the complex operations
			else {
				if (choice == 1){ // Logarithm, using the buffer as a base.
//todo ASHLEY decide to add the code or leave a todo for students
				}
				else if (choice == 2){ // Logarithm, using the operand as a base.
//todo ASHLEY decide to add the code or leave a todo for students
				}
				else if (choice == 3){ // Exponent, using the buffer as a base.
//todo ASHLEY decide to add the code or leave a todo for students
				}
				else if (choice == 4){ // Exponent, using the operand as a base.
//todo ASHLEY decide to add the code or leave a todo for students
				}
				else{ // If there's a failure
					System.out.println("That is not a valid input!");
				}
			}

        }
    }
	
	
}