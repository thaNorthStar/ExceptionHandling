import java.util.Scanner;

public class LaunchException1 {
    public static void main(String[] args)  {
        // an example of an unchecked exception where
        // there's no warning from the compiler that
        // dividing by 0 will result in
        // java.lang.ArithmeticException: / by zero
        System.out.println("Connection to app is established");
        try {
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter the 1st number to divide: ");
            int num1=scan.nextInt();
            System.out.println("Enter the 2nd number to divide: ");
            int num2=scan.nextInt();
            int result=num1/num2;
            System.out.println("The result is: "+result);
        } catch (Exception e) {
            System.out.println("You're trying to divide by zero");;
        }
        System.out.println("Connection is terminated");
    }
}
