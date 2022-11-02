
import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args)
    {
        String ignore = ",";
        int where;
        int newLength;
        int where2;
        int newLength2;
        int firstx;
        int secondx;
        int firsty;
        int secondy;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first coordinate: ");
        String coordinate1 = input.nextLine();

        int length = coordinate1.length();
        coordinate1=coordinate1.substring(1,length-1);
        newLength=coordinate1.length();
        where=coordinate1.indexOf(ignore);
        String first =coordinate1;
        int l1=coordinate1.length();

        firstx=Integer.parseInt(coordinate1.substring(0,where));
        firsty=Integer.parseInt(coordinate1.substring(where+1));

        System.out.println("Enter your second coordinate: ");
        String coordinate2 = input.nextLine();
        int length2 = coordinate2.length();
        coordinate2=coordinate2.substring(1,length2-1);
        newLength2=coordinate2.length();
        where2=coordinate2.indexOf(ignore);
        String second = coordinate2;
        int l2=coordinate2.length();

        secondx=Integer.parseInt(coordinate2.substring(0,where2));
        secondy=Integer.parseInt(coordinate2.substring(where2+1));

        System.out.println();

        LinearEquation initial = new LinearEquation(firstx, firsty, secondx, secondy);
        System.out.println(initial.lineInfo());

        System.out.println("Enter your X value: ");
        int X =input.nextInt();
        System.out.println("Coordinate for X is: " + initial.returnX(X));

    }
}



