// LeetCode Q 1920 Easy : Build array from permutation
// Input: nums = [0,2,1,5,3,4]
// Output: [0,1,2,4,5,3]
// Explanation: The array ans is built as follows:
//        ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
//        = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
//        = [0,1,2,4,5,3]

import java.util.Arrays;
public class Q_1920 {
        public static void main(String[] args) {

        int[] nums= {0,2,1,5,3,4};
        buildArray(nums);
    }
        static int[] buildArray(int[] nums){

        int[] ans = new int[nums.length];

        for (int i=0 ;i< ans.length; i++){
            ans[i]=nums[nums[i]];
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}

