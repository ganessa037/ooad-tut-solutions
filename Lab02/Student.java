// import java.util.ArrayList;
// import java.util.Scanner;

// public class Student extends Person {
//     // ArrayList to hold subjects and grades
//     private ArrayList<Subject> subjects;

//     // Constructor that calls the superclass constructor
//     public Student(String nm, String gen) {
//         super(nm, gen);
//         this.subjects = new ArrayList<>();
//     }

//     // Method to add a subject and its grade
//     public void addSubject(String code, char grade) {
//         subjects.add(new Subject(code, grade));
//     }

//     // Method to remove a subject by code
//     public void remSubject(String code) {
//         subjects.removeIf(subject -> subject.getCode().equals(code));
//     }

//     // Method to print the transcript
//     public void printTranscript() {
//         System.out.println("Transcript for " + this.toString() + ":");
//         for (Subject subject : subjects) {
//             System.out.println(subject);
//         }
//     }

//     // Override toString method to format the student's name
//     @Override
//     public String toString() {
//         return "Student Name: " + super.getName(); // Assuming getName() is a method in Person
//     }
// //---------------------------------------------------------------------------------------------------------
//     // Main method to run the command line menu
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         Student student = new Student("Jackson", "Male"); // Example student

//         while (true) {
//             System.out.println("Menu:");
//             System.out.println("1. Add Subject");
//             System.out.println("2. Remove Subject");
//             System.out.println("3. Print Transcript");
//             System.out.println("4. Exit");
//             System.out.print("Choose an option: ");
//             int choice = scanner.nextInt();
//             scanner.nextLine(); // Consume newline

//             switch (choice) {
//                 case 1:
//                     System.out.print("Enter subject code: ");
//                     String code = scanner.nextLine();
//                     System.out.print("Enter grade (A-F): ");
//                     char grade = scanner.nextLine().charAt(0);
//                     student.addSubject(code, grade);
//                     break;
//                 case 2:
//                     System.out.print("Enter subject code to remove: ");
//                     String codeToRemove = scanner.nextLine();
//                     student.remSubject(codeToRemove);
//                     break;
//                 case 3:
//                     student.printTranscript();
//                     break;
//                 case 4:
//                     System.out.println("Exiting...");
//                     scanner.close();
//                     return;
//                 default:
//                     System.out.println("Invalid option. Please try again.");
//             }
//         }
//     }
// }

// // Subject class to hold subject code and grade
// class Subject {
//     private String code;
//     private char grade;

//     public Subject(String code, char grade) {
//         this.code = code;
//         this.grade = grade;
//     }

//     public String getCode() {
//         return code;
//     }

//     @Override
//     public String toString() {
//         return "Subject Code: " + code + ", Grade: " + grade;
//     }
// }

// // Assuming Person class exists with the required methods
// abstract class Person {
//     private String name;
//     @SuppressWarnings("unused")
//     private String gender;

//     public Person(String name, String gender) {
//         this.name = name;
//         this.gender = gender;
//     }

//     public String getName() {
//         return name;
//     }

// }

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {
    private ArrayList<Subject> subjects;

    public Student(String name, String gender) {
        super(name, gender);
        subjects = new ArrayList<>();
    }

    public void addSubject(String code, char grade) {
        subjects.add(new Subject(code, grade));
    }

    public void remSubject(String code) {
        subjects.removeIf(subject -> subject.getCode().equals(code));
    }

    public void printTranscript() {
        System.out.println("Transcript for " + getName() + ":");
        for (Subject subject : subjects) {
            System.out.println(subject);
        }
    }

    @Override
    public String toString() {
        return "Student Name: " + getName() + ", Gender: " + getGender();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student gender: ");
        String gender = scanner.nextLine();

        Student student = new Student(name, gender);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Subject");
            System.out.println("2. Remove Subject");
            System.out.println("3. Print Transcript");
            System.out.println("4. Print Student Info");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter subject code: ");
                    String code = scanner.nextLine();
                    System.out.print("Enter grade: ");
                    char grade = scanner.nextLine().charAt(0);
                    student.addSubject(code, grade);
                    break;
                case 2:
                    System.out.print("Enter subject code to remove: ");
                    code = scanner.nextLine();
                    student.remSubject(code);
                    break;
                case 3:
                    student.printTranscript();
                    break;
                case 4:
                    System.out.println(student);
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}