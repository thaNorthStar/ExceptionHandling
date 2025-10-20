import java.util.Scanner;
//this program is example of handling an exception in main stack
class Alpha{
    void alpha() throws ArithmeticException{        //ducking the exception
        System.out.println("Connection to Calc app is established");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the 1st number to divide");
        int num1=scan.nextInt();
        System.out.println("Enter the 2nd number to divide");
        int num2=scan.nextInt();
        int result=num1/num2;
        System.out.println("The result is "+ result);
    }
}
class Beta{
    void beta() throws ArithmeticException{     //ducking the exception, passing to caller
        Alpha a=new Alpha();
        a.alpha();
    }
}
public class LaunchException4 {
    public static void main(String[] args) {
        try {
            Beta b=new Beta();
            b.beta();
        } catch (ArithmeticException ae) {
            System.out.println("Exception finally handled in main ");;
        }
    }
}
