// Q1 Two sum
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
import java.util.Arrays;

public class Q_1 {
    public static void main(String[] args) {
       int[] nums = {2,4,3};
       int target = 7;
       twoSum(nums,target);
    }

    static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length; j++) {
                if (nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }

        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
