import java.util.Scanner;

public class ScannerExample {
    
    static Scanner s = new Scanner(System.in);

    public static int GetInput(){
        System.out.print("Enter a number: ");
        return s.nextInt();
    }

    public static String GetName(){
        System.out.print("Enter a name: ");
        return s.next();
    }
    

    public static void main(String[] args){
        System.out.println("You inputed: " + GetInput());
        String name = GetName();
        System.out.println("Your name is: " + name);
    }

}
