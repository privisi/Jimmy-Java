public class Arrays {
    public static void main(String[] args){
        String[] names = new String[5];
        names[0] = "bob";
        names[1] = "fred";

        System.out.println("Name1 " + names[1]);

        // I don't exist
        System.out.println("Name4 " + names[4]);

        int count = 0;
        while(count < names.length){
            System.out.println("Name " + count + ": " + names[count]);
            count++;
        }
    }
}
