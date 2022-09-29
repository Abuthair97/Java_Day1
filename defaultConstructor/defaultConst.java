package defaultConstructor;
public class defaultConst {
     String name;
     int age;
     defaultConst(){
        name= "Abuthair";
        age=21;
    
     }

     void getDetails(){
        System.out.println(name);
        System.out.println(age);
     }

     String greet(String msg){
        return "Abuthair"+msg;

     }
}
