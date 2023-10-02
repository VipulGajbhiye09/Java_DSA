//Leetcode Medium 55. Jump-Game
//You are given an integer array nums. You are initially positioned at the array's first index,
//and each element in the array represents your maximum jump length at that position.
//Return true if you can reach the last index, or false otherwise.
//Input: nums = [2,3,1,1,4]
//Output: true
//Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

public class Q_0055 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 4};
        System.out.println(canJump(nums));
    }

    //used greedy algo
    static boolean canJump(int[] nums) {
        int current_pos, final_pos;
        current_pos=0;
        final_pos = nums.length - 1;

        //checked whether final_pos is reachable by an i+nums[i] if yes shift final_pos to i
        for (int i = final_pos; i >=0 ; i--) {
            if (i+nums[i]>=final_pos){
                final_pos=i;
            }
        }
        //if after checking whole array if final_pos is at 0 return true
        if (current_pos==final_pos){
            return true;
        } else {
            return false;
        }

    }
}
