package Using2Class;
public class calling2Class {
    public static void main(String[] args) {
      twoClass two = new twoClass();
      two.Id=1;
      two.name="abisheik";
      two.age=21;

      System.out.println(two.Id);
      System.out.println(two.name);
      System.out.println(two.age);

      twoClass two1 = new twoClass();
      two1.Id=2;
     two1.name= "Shamili";
     two1.age=33;

           
      System.out.println(two1.Id);
      System.out.println(two1.name);
      System.out.println(two1.age);


    }
}
