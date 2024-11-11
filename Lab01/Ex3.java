import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 20: ");
        int userInput = scanner.nextInt();

        if (userInput >= 1 && userInput <= 20) {
            // Calculate the total number of columns based on the user input
            int totalColumns = userInput;

            // Print the grid directly
            for (int i = 1; i <= userInput; i++) {
                for (int j = 0; j < totalColumns; j++) {
                    int value = j * userInput + i;
                    // Only print if the value is within the limit
                    if (value <= userInput * userInput) {
                        System.out.format("%2d ", value);
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Number not between 1 and 20. Exiting.");
        }

        scanner.close();
    }
}