import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = myScanner.nextInt();

        if (num>=-50 && num <=50) {
            System.out.println("Your number is between -50 and 50");
        } else if (num>100 || num<-100         ) {
            System.out.println("Your number is more then 100 away from 0!");
        } else {
            System.out.println("Something else");
        }

        myScanner.close();
    }
}
