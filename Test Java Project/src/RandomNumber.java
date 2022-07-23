import java.util.Random;

public class RandomNumber {
    public static void main(String[] args){
        Random r = new Random();
        int randNum = r.nextInt(1, 100);
        System.out.println(randNum);
    }
}
