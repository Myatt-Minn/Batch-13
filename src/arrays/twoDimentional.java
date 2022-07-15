package arrays;

public class twoDimentional {
    public static void main(String[] args) {
        int a = 12;
        int[] numbers = {1,2,3,4,5};

        int[][] nums = {
                {1, 2, 3, 4}, {2, 3, 4, 5}, {3, 4, 5, 6}
        };
        System.out.println(nums[2][1]);

        for (int[] num : nums){
            for (int i : num){
                System.out.print(i+"\t");
            }
            System.out.print("\n");
        }

        for (int i = 0; i < nums.length; i++) {
            for(int j = 0; j< nums.length ; j++){
                System.out.print(nums[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
}
