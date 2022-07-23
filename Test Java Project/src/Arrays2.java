import java.util.Random;

public class Arrays2 {
    public static void main(String[] args){
        Random r = new Random()
        // Random number of monsters between 1 and 10
        int numOfMonsters = r.nextInt(10) + 1;
        // Each monster should have their own health, between 10 - 25
        // All monsters do 1-5 damage to the player
        // Player will deal between 1-5 damage to all monsters at once
        // End the battle when all monsters are dead, or when the player dead
    }
}
