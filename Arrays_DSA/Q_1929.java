// LeetCode Q 1929 Easy : Concatenation of Array
//Input: nums = [1,2,1]
//Output: [1,2,1,1,2,1]
// Explanation: The array ans is formed as follows:
    //- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
    //- ans = [1,2,1,1,2,1]

import java.util.Arrays;

public class Q_1929 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 1};
        getConcatenation(nums);
    }
    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for (int i=0; i< ans.length; i++){
            if (i< nums.length){
                ans[i]=nums[i];
            }else{
                ans[i]=nums[i-nums.length];
            }
        }
        System.out.println(Arrays.toString(ans));

        return ans;
    }
}
