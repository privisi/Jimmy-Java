
public class Calculations {
    public static void main(String[] args){
        int health = 30;
        int healthPotion = 50;

        System.out.println("My health is: " + health);

        health = health - 5;

        System.out.println("OOf i got hit");
        System.out.println("My health is: " + health);

        System.out.println("Drinking health potion");
        
        health++; // Add 1 to variable
        health--; // Minus 1 to variable

        health+= 50; 
        health-= 50;
        health*= 50;
        health/= 50;

        health = ((healthPotion * 4) / 2) + health;

    }
}