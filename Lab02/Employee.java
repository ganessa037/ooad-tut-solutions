public class Employee extends Person{   
    private int employeeID; 
    
    public Employee(String nm, String gen, int id) {
        super(nm, gen);
        this.employeeID = id;
    } 

    public Employee(String nm, String gen){
        this(nm,gen,0);
    }

    @Override
    public String toString(){
        return "Employee ID: " + employeeID + ", Name: "+ getName() + ",Gender: " + getGender();
        
    }
}