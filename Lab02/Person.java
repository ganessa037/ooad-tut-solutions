// public abstract class Person {
     
//     private String name;
//     private String gender;
     
//     public Person(String nm, String gen){
//         this.name=nm;
//         this.gender=gen;
//     }   
//     public String getName() {return name;} 
//     public String getGender() {return gender;}

//     //abstract method
//     public abstract String toString();
// }

public abstract class Person {
    private String name;
    private String gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public abstract String toString();
}