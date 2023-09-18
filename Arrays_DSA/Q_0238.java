//Leetcode Q 238.Medium Product of Array Except Self
//Given an integer array nums, return an array answer such that
//answer[i] is equal to the product of all the elements of nums except nums[i].
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//You must write an algorithm that runs in O(n) time and without using the division operation.

import java.util.Arrays;

public class Q_0238 {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5};
        productExceptSelf(nums);
    }

    static int[] productExceptSelf(int[] nums) {
        int[] ans= new int[nums.length];
        int[] left_arr=new int[nums.length];
        int[] right_arr=new int[nums.length];

        int prod=1;
        for (int i = 0; i < nums.length; i++) {
            left_arr[i]=prod;
            prod=prod*nums[i];
        }

        prod=1;
        for (int i = nums.length-1; i >=0 ; i--) {
            right_arr[i]=prod;
            prod=prod*nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            ans[i]=left_arr[i]*right_arr[i];
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}

//  O(n^2) not accepted must do it in O(n)

//        int[] ans= new int[nums.length];
//        for (int i = 0; i < ans.length; i++) {
//            int product=1;
//            for (int j = 0; j < ans.length; j++) {
//                if (i!=j){
//                    product*=nums[j];
//                }
//            }
//            ans[i]=product;
//        }
//        return ans;
