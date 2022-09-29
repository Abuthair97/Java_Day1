package LocalVariableHiding;

public class Employeee {
    int Id;  
    String name;
    int salary;

     Employeee(int Id,String name,int salary){
     this.Id=Id;
     this.name=name;
     this.salary=salary;
    }

    void getDetails(){
        System.out.println(Id+" ");
        System.out.println(name+" ");
        System.out.println(salary+" ");
    }



    int Sum(int a , int b){
    return a+b;
    }
}
