// import java.util.Scanner;

// public class Ex2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter an integer: ");
//         int n = scanner.nextInt();
        
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 if (i == 1) {
//                     // Print the first row with numbers followed by hyphen
//                     System.out.print(j + "-");
//                 } else if (i == n) {
//                     // Print the last row in reverse order
//                     if (j == n) {
//                         System.out.print(n - j + 1); // No hyphen at the end
//                     } else {
//                         System.out.print((n - j + 1) + "-");
//                     }
//                 } else if (j == 1) {
//                     // Print the first column for middle rows
//                     System.out.print(i + "-");
//                 } else if (j == n) {
//                     // Print the last column for middle rows
//                     System.out.print(n - i + 1 + "-");
//                 } else {
//                     // Print the hyphens for middle columns
//                     System.out.print("-+");
//                 }
//             }
//             System.out.println(); // Move to the next line
//         }
//     }


// }

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1) {
                    // Print the first row
                    System.out.print(j + "-");
                } else if (i == n) {
                    // Print the last row in reverse order
                    System.out.print((n - j + 1) + "+");
                } else if (j == 1) {
                    // Print the first column for middle rows
                    System.out.print(i + "=");
                } else if (j == n) {
                    // Print the last column for middle rows
                    System.out.print((n - i + 1) + "-");
                } else {
                    // Print spaces for the hollow middle section
                    System.out.print("--");
                }
            }
            System.out.println(); // Move to the next line
        }
        scanner.close();
    }
}


