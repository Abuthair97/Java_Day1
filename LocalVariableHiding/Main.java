package LocalVariableHiding;

public class Main{
    public static void main(String[] args) {
        
    Employeee emp1= new Employeee(101,"Abuthair", 2000);
    Employeee emp2= new Employeee(102,"Sheik", 2200);

    emp1.getDetails();
    emp2.getDetails();

    System.out.println(emp1.Sum(12, 18));
    System.out.println(emp2.Sum(15, 14));
    }
}