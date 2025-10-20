import java.util.Arrays;
import java.util.Scanner;

public class LaunchException3 {
    public static void main(String[] args) {
        System.out.println("Connection to Calc app is established");
        Scanner scan=new Scanner(System.in);
        try
        {
            System.out.println("Enter the 1st number to divide");
            int num1=scan.nextInt();
            System.out.println("Enter the 2nd number to divide");
            int num2=scan.nextInt();
            int result=num1/num2;
            System.out.println("The result is "+ result);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Please use non zero denominator");
        }
        try
        {
            System.out.println("Enter the size of an array: ");
            int size=scan.nextInt();
            int[] arr=new int[size];
            System.out.println("Enter an element for the array: ");
            int elem=scan.nextInt();
            System.out.println("Enter the index of the element: ");
            int index=scan.nextInt();
            arr[index]=elem;
            System.out.println("Element "+elem+" is present at index: "+index);
            System.out.println(Arrays.toString(arr));

        }
        catch(NegativeArraySizeException nae)
        {
            System.out.println("be positive");
        }

        catch(ArrayIndexOutOfBoundsException aa)
        {
            System.out.println("Be in your limits, Don't cross it");
        }
        catch(Exception e)
        {
            System.out.println("Wrong input!");
        }
        System.out.println("Connection is terminated");
    }
}
