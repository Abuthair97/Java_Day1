package parameterConstructor;
public class parameterConst {
    String name;
    int age;

    parameterConst(String n, int s) {
        name = n;
        age = s;
    }

    void getList() {
        System.out.print(name);
        System.out.print(age);
    }

  String msg (String msg){
    return "HEllo "+msg;
  }
}
