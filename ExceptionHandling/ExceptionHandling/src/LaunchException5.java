

//unchecked exception==compiler will not force us to handle, will not be checked during compilation
//checked exception==will be checked by compiler & will not let u run the program

// this program is example of when is good/OK to duck an exception (when its checked), but still best to handle
public class LaunchException5 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Before sleep. . .");
        Thread.sleep(4000);  //checked exception
        System.out.println("after a brief nap .  .");
    }
}
