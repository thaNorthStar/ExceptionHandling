import java.util.Scanner;
//this program is example of rethrowing exception & finally block
class Alpha1{
    void alpha() throws ArithmeticException{        //ducking the exception
        System.out.println("Connection to Calc app is established");
        try {
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter the 1st number to divide");
            int num1=scan.nextInt();
            System.out.println("Enter the 2nd number to divide");
            int num2=scan.nextInt();
            int result=num1/num2;
            System.out.println("The result is "+ result);
        } catch (ArithmeticException ae) {
            System.out.println("Exception handled in Alpha1 only");
            throw ae;  //rethrowing exception
        }finally{
            System.out.println("Calc App Connection terminated");
        }
    }
}
public class LaunchException6 {
    public static void main(String[] args) {
        try {
            System.out.println("Main method connection");
            Alpha1 a=new Alpha1();
            a.alpha();
        } catch (ArithmeticException ae) {
            System.out.println("Exception handled in Main");
        }
        System.out.println("Connection terminated in main");
    }
}
