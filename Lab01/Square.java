 
import java.util.*; // or java.util.Scanner

public class Square {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);


		int number1;
		do {
			System.out.print("Enter an integer between 1 and 20: ");
			number1 = input.nextInt();

			if (number1 < 1 || number1 > 20) {
				System.out.println("Number not between 1 and 20. Exiting.");
				return;
			}

			// Compute the square of the number
			// int square = number1 * number1;
			// System.out.println("The square of " + number1 + " is " + square);

			// Print the square pattern
			for (int i = 0; i < number1; i++) {
				for (int j = 0; j < number1; j++) {
					if (i == 0 || i == number1 - 1 || j == 0 || j == number1 - 1) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		} while (number1 >= 1 && number1 <= 20);
		

	} // end main
} //end class