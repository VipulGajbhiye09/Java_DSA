//Leetcode Medium 34.  Find First and Last Position of Element in Sorted Array
//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//If target is not found in the array, return [-1, -1].
//You must write an algorithm with O(log n) runtime complexity.

import java.util.Arrays;

public class Q_0034 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        searchRange(nums,target);
    }

    static int[] searchRange(int[] nums, int target) {
        int[] result=new int[]{-1,-1};
        int count=0;


        System.out.println(Arrays.toString(result));
        return result;
    }
}
