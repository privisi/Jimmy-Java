public class ForLoop {
    public static void main(String[] args){
        int[] healths = new int[5];
        healths[1] = 32;
        healths[4] = 23;

        for(int i = 0; i < healths.length; i++){
            System.out.println(healths[i]);
        }
    }
}
