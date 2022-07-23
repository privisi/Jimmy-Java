import java.util.Random;

public class WhileLoop2 {
    public static void main(String[] args){
        // Player
        int playerHealth = 100;
        int playerMinDmg = 5;
        int playerMaxDmg = 10;
        float playerHitRate = 0.75f;
        float playerCritRate = 0.25f;

        // Monster
        int monsterHealth = 100;
        int monsterMinDmg = 5;
        int monsterMaxDmg = 10;
        float monsterHitRate = 0.5f;
        
        Random r = new Random();

        // player has a 75% chance to hit
        // Monster has a 50% chance to hit
        // the player has a 25% to critical hit, which makes the dmg 2.5x

        while (playerHealth > 0 && monsterHealth > 0){
            System.out.println("Player Health: " + playerHealth + " | Monster Health: " + monsterHealth);

            // Player turn
            // Hit
            if(r.nextFloat() < playerHitRate){
                int playerDmg = r.nextInt(playerMinDmg, playerMaxDmg);

                // Check if critical hit
                if(r.nextFloat() < playerCritRate){
                    System.out.println("Critical Hit!");
                    playerDmg *= 2.5f;
                }

                System.out.println("Player has hit monster for: " + playerDmg);
                monsterHealth -= playerDmg;

            // Miss
            }else{
                System.out.println("Player has missed");
            }
            
            // Monster turn
            // Hit
            if(r.nextFloat() < monsterHitRate){
                int monsterDmg = r.nextInt(monsterMinDmg, monsterMaxDmg);
                System.out.println("Monster has hit player for: " + monsterDmg);
                playerHealth -= monsterDmg;

            // Miss
            }else{
                System.out.println("Monster has missed");
            }

            System.out.println();
        }

        System.out.println("Player Health: " + playerHealth + " | Monster Health: " + monsterHealth);

        if(playerHealth > 0 && monsterHealth < 0){
            System.out.println("The player won");
        }else if(monsterHealth > 0 && playerHealth < 0){
            System.out.println("The monster won");
        }else{
            System.out.println("Double KO, both died");
        }

    }
}
