class Demo1{
    void disp(){
        try {
            System.out.println("Method started");
            System.exit(0);
        } finally{
            System.out.println("Method ended");
        }
    }
}
public class LaunchFinallySE {
    public static void main(String[] args) {
        Demo1 demo = new Demo1();
        demo.disp();
    }
}
