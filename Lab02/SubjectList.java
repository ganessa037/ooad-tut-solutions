public class SubjectList {
    public static void main(String[] args) {
        // Creating Subject objects
        Subject s1 = new Subject("CS101", 'A');
        Subject s2 = new Subject("MATH202", 'B');
        Subject s3 = new Subject("BIO303", 'A');
        Subject s4 = new Subject("CHEM404", 'A');

        // Printing the details of each Subject object
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}