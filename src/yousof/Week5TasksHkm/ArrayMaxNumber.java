package yousof.Week5TasksHkm;

public class ArrayMaxNumber {

    public static int MaxNumberArray(int[] nums){

        int maxNum = nums[0];

        for(int number : nums){
            if (number > maxNum){
                maxNum = number;
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {

       int[] nums = {5,10,25,39,100};
       int maxNum = MaxNumberArray(nums);
        System.out.println("Max number: " + maxNum);
    }

}
/*
Write a method that can find the maximum number from an int Array
 */