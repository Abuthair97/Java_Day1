public class CoreJavaDay1 {
    String name;
    int salary;

    public static void main(String[] args) {
     
        CoreJavaDay1 core=new CoreJavaDay1();
        System.out.println(core.name);
        System.out.println(core.salary);
       core.name="Sheika";
       core.salary=200;

       System.out.println(core.name);
       System.out.println(core.salary);


       CoreJavaDay1 core1 = new CoreJavaDay1();
       core1.name="giri";
       core1.salary=233;
       System.out.println(core1.name);
       System.out.println(core1.salary);
    }
}