package arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numbers = {23,44,21}; //one dimentional array
        String[] names = {"Myat Minn","suner may","lwin oo"};

        System.out.println(Arrays.toString(names));
        int[] nums = new int[7];
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i*2
            );
        }

}
}
