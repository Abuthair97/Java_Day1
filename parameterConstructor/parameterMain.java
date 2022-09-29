package parameterConstructor;
public class parameterMain {
    public static void main(String[] args) {
        
        parameterConst a = new parameterConst("Sheik",21);
        parameterConst a1 = new parameterConst("abuthair",23);
         a.getList();
         a1.getList();

         String vc= a.msg(" "+"Javis");
         System.out.println(vc);
    }
}
