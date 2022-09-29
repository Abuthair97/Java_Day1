package OOPS_Polymorphism_MethodOverloading;

public class Shape {

    void calcArea(int side){
        System.out.println("Square" +(side*side));
    }

    int calcArea(int length, int breadth){
        return(length*breadth);
    }
    void calcArea(float radius){
        System.out.println("circle" +Math.PI*radius*radius );
    }
    double calcArea(int height ,float length){
        return 0.5*height*length;
    }


}

