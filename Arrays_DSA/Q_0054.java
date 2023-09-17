// Leetcode 54. Medium Spiral Matrix
//Given an m x n matrix, return all elements of the matrix in spiral order.

import java.util.ArrayList;
import java.util.Arrays;

public class Q_0054 {
    public static void main(String[] args) {
        int[][] matrix = {{3,7,8}, {9,11,13}, {15,16,17}};
        spiralOrder(matrix);
    }

    public static ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>(matrix.length);
        int top,left,bottom,right;
        top=left=0;
        right=matrix[0].length-1;
        bottom=matrix.length-1;
        
        while (top<=bottom && left<=right){
            
            for (int i = left; i <=right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <=bottom ; i++) {
                ans.add(matrix[i][right]);
            }
            right--;
            if (top<=bottom){
                for (int i = right; i>=left; i--) {
                    ans.add(matrix[bottom][i]);
                }
            }
            bottom--;
            if (left<=right){
                for (int i = bottom; i>=top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
            
        }

        System.out.println(ans);
        return ans;

        
    }
}
