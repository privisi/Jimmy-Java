public class Methods {
    
    public static void Add(int num1, int num2){
        System.out.println(num1 + num2);
    }

    public static int Power(int num, int power){
        int result = 1;
        for(int i = 0; i < power; i++){
            result *= num;
        }
        return result;
    }

    public static boolean Opposite(boolean var){
        return !var;
    }

    public static int AddAll(int[] nums){
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            total += nums[i];
        }
        return total;
    }

    public static boolean AllAboveZero(int[] nums){
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] <= 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Add(1, 2);
        int num = Power(5, 3);
        System.out.println(num);
        int bigNum = Power(23, 5);
        System.out.println(bigNum);
        System.out.println(Opposite(true));
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(AddAll(numbers));
        System.out.println(AllAboveZero(new int[] {1, 2, 3, 4}));
    }

}
