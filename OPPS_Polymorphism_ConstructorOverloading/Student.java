package OPPS_Polymorphism_ConstructorOverloading;

public class Student {
    String name, city;
    int studentId;

    public Student() {
        System.out.println("This is Default");
    }

    public Student(String name, int id) {
        this.name = name;
        studentId = id;
    }

    public Student(String name, String city, int studentId) {
        this.name = name;
        this.city = city;
        this.studentId = studentId;
    }

    void getDetails() {
        if (name != null) {
            System.out.println("name  " + name);
        }
        if (studentId > 0) {
            System.out.println("StudentID     " + studentId);
        }

        if (city != null) {
            System.out.println("City" + city);
        }

        else {
            System.out.println("No Output");
        }
    }

}
