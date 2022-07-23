public class IfStatement {
    public static void main(String[] args){
        double health = -15.523;
        boolean alive = health > 0;

        if(alive){
            System.out.println("I am alive");
        }

        System.out.println("Alive state: " + alive);
        System.out.println("Am i dead " + (alive == false));

        if(alive == false){
            System.out.println("I am dead");
        }


        int money = 50;

        if(money >= 50){
            System.out.println("I am rich");
        }else if(money < 49 && money >= 0){
            System.out.println("I am not rich");
        }else if(money == 0){
            System.out.println("I have no money");
        }else{
            System.out.println("I am in debt");
        }

    }
}
