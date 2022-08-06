import java.util.Scanner;

public class ScannerHomework {
    
    static Scanner s = new Scanner(System.in);

    public static int GetInput(){
        System.out.print("Enter a number: ");
        return s.nextInt();
    }

    public static void main(String[] args){
        int playerHealth = 100;
        int monsterHealth = 100;

        while(playerHealth > 0 && monsterHealth > 0){
            // Get the input to decide what the player does
            // 1 = attack
            // 2 = block
            // 3 = heal

            // The monster will sometimes warn that they are going to do a critical attack
            // blocking is so that u can reduce that damage.
        }

    }

}
