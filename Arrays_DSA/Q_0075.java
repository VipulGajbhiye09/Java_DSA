import java.util.Arrays;

public class Q_0075 {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
    }
    static void sortColors(int[] nums) {
        int c0,c1,c2;
        c0=c1=c2=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0){
                c0++;
            }else if (nums[i]==1) {
                c1++;
            }else {
               c2++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i<c0){
                nums[i]=0;
            }else if (i>=c0 && i<c0+c1) {
                nums[i]=1;
            }else if(i>=c1 && i<c0+c1+c2){
                nums[i]=2;
            }
        }
    }
}
