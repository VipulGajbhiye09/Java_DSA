//Leetcode Q 1304. Find N Unique Integers Sum up to Zero
//Given an integer n, return any array containing n unique integers such that they add up to 0.

import java.util.Arrays;

public class Q_1304 {
    public static void main(String[] args) {
        sumZero(9);
    }

    static int[] sumZero(int n) {
        int[] ans=new int[n];
        if (n%2!=0){
            ans[0]=0;
            for (int i = 1; i < ans.length; i+=2) {
                ans[i]=i;
                ans[i+1]=-i;
            }
        }else {
            for (int i = 0; i < ans.length; i+=2) {
                ans[i]=i+1;
                ans[i+1]=-(i+1);
            }
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
