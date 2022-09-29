package OOPS_Polymorphism_MethodOverloading;

public class overloadDemo {
    public static void main(String[] args) {
        Shape shape = new Shape();
       shape.calcArea(10);
       shape.calcArea(10.5f);
       System.out.println("area "+shape.calcArea(100, 200));
       System.out.println("TRI "+shape.calcArea(100, 10.2f));



    }
}
