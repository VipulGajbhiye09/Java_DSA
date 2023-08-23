//LeetCode Q 1480 Running Sum of 1d Array
//Input: nums = [1,2,3,4]
//Output: [1,3,6,10]
//        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
import java.util.Arrays;

public class Q_1480 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        runningSum(nums);
    }

    static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i+1; j++) {
                ans[i]=ans[i]+nums[j];
            }
        }
        System.out.println(Arrays.toString(ans));

        return ans;
    }
}
