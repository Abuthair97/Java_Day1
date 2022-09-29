package defaultConstructor;
public class defaultMain {
    public static void main(String[] args) {
        defaultConst s = new defaultConst();
        s.getDetails();

        String v = s.greet("Sheika");
        System.out.println(v);
    }
}
