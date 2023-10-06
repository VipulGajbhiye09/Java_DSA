import java.util.Arrays;

public class Q_0189 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
    }

    static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] result = new int[n];

        if (k == 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = nums[i];
        }

        System.arraycopy(result, 0, nums, 0, n);
        System.out.println(Arrays.toString(nums));

    }

}

