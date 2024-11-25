public class EmployeeDriver {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Male", 1234);
        Employee employee2 = new Employee("Victoria", "Female", 13);
        Employee employee3 = new Employee("Victor", "Male", 69);

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());
        
    }
}