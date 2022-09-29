package OPPS_Polymorphism_ConstructorOverloading;

public class main {

    public static void main(String[] args) {
        
        Student student1=new Student();
        Student student2= new Student("Abuthair", 101);
        Student student3= new Student("Sheik ", "Chennai", 102);

        student1.getDetails(); 
        student2.getDetails(); 
        student3.getDetails(); 
    }
    
}
