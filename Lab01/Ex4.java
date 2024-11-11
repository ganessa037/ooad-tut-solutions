 
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.nextLine().toUpperCase();
        int length = input.length();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(input.charAt((i + j) % length));
            }
            System.out.println();
        }
    }   
}