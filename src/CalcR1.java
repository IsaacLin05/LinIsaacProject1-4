import java.util.Scanner;
public class CalcR1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an expression with *,/,-,+,%: ");
      String m = input.nextLine();
      int length = m.length();
      double x;
      double y;
      int e = 0;
      String fX;
      String fY;


        String multiply="*";
            if (m.contains(multiply)) {
                e=m.indexOf(multiply);
            }
        String divide="/";
            if (m.contains(divide)) {
                e=m.indexOf(divide);
            }
        String add= "+";
            if (m.contains(add)) {
                e=m.indexOf(add);
            }
        String subtract= "-";
            if (m.contains(subtract)) {
                e=m.indexOf(subtract);
            }
        String remainder="%";
            if (m.contains(remainder)) {
                e=m.indexOf(remainder);
            }
                x=Double.parseDouble(m.substring(0,e));
                y=Double.parseDouble(m.substring(e+1,length));

                    Calculator more = new Calculator(m, x, y);
                    System.out.println(more.Result(m));
    }
}
