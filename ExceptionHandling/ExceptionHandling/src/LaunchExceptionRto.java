import java.util.Scanner;

class UnderAgeException extends Exception{
    UnderAgeException(String message){
        super(message);
    }
}

class OverAgeException  extends Exception{
    OverAgeException(String message){
        super(message);
    }
}

class Applicant{
    int age;
    public void input(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age");
        age=scan.nextInt();
    }
    void verify() throws UnderAgeException, OverAgeException {
        if (age<18){
            UnderAgeException uae=new UnderAgeException("You're too young");
            System.out.println(uae.getMessage());
            throw uae;
        }else if(age>60){
            OverAgeException oae=new OverAgeException("You're too old");
            System.out.println(oae.getMessage());
            throw oae;
        }else{
            System.out.println("You're eligible");
        }
    }
}

class Rto{
    public void initiate(){
        Applicant a=new Applicant();

        try {
            a.input();
            a.verify();
        } catch (UnderAgeException | OverAgeException e) {
            try {
                a.input();
                a.verify();
            } catch (UnderAgeException | OverAgeException e1) {
                System.out.println("Dont try again");
                System.exit(0);
            }
        }
    }
}

public class LaunchExceptionRto {
    public static void main(String[] args) {
    Rto r=new Rto();
    r.initiate();
    }
}
