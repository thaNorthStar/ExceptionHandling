import java.util.Arrays;
import java.util.Scanner;

public class LaunchException2 {
    public static void main(String[] args)  {

        System.out.println("Connection to app is established");
        try {
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter the 1st number to divide: ");
            int num1=scan.nextInt();
            System.out.println("Enter the 2nd number to divide: ");
            int num2=scan.nextInt();
            int result=num1/num2;
            System.out.println("The result is: "+result);

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



        } catch (ArithmeticException ae) {
            System.out.println("please provide non zero denomination");;
        }catch(NegativeArraySizeException nae){
            System.out.println("please be positive");
        }catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Dont cross your limit");
        }catch (Exception e) {
            System.out.println("Error");
        }
        System.out.println("Connection is terminated");
    }
}
