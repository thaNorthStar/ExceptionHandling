import java.util.Scanner;

class InvalidCustomerException extends Exception{
    public InvalidCustomerException(String message){
        super(message);
    }
}

class Atm{
    int userId=1212; //assume this is in DB
    int password=1111; //assume this is in DB
    int uid;
    int pw;

    public void input(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your user id:");
        uid=scan.nextInt();
        System.out.println("Enter your user password:");
        pw=scan.nextInt();
    }
    public void verify() throws InvalidCustomerException{
        if((userId == uid) && (password==pw)){
            System.out.println("Take your money");
        }else{
            InvalidCustomerException ice=new InvalidCustomerException("Are you legit?");
            //System.out.println(ice);
            System.out.println(ice.getMessage());
            throw ice;
        }
    }
}
class Bank{
    public void initiate(){
        Atm atm=new Atm();

        try {
            atm.input();
            atm.verify();
        } catch (InvalidCustomerException e1) {
            try {
                atm.input();
                atm.verify();
            } catch (InvalidCustomerException e2) {
                try {
                    atm.input();
                    atm.verify();
                } catch (InvalidCustomerException e3) {
                    System.out.println("oh choor dude we caught you");
                    System.exit(0);
                }
            }
        }
    }
}
public class LaunchCustomException {
    public static void main(String[] args) {
    Bank b1=new Bank();
    b1.initiate();
    }
}
