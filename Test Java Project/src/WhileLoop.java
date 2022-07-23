public class WhileLoop {
    public static void main(String[] args){
        int health = 50;
        boolean alive = true;

        while(alive){
            System.out.println("My health is: " + health);
            health-=3;
            alive = health > 0;
        }
        
        System.out.println("I am dead");
    }
}
