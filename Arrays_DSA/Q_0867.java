//LeetCode Q867 : Transpose matrix
//Given a 2D integer array matrix, return the transpose of matrix.
//The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
//Input: matrix = [[1,2,3],
//                 [4,5,6],
//                 [7,8,9]]
//Output:         [[1,4,7],
//                 [2,5,8],
//                 [3,6,9]]

import java.util.Arrays;

public class Q_867 {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {{5}, {8}};
        transpose(matrix);
    }

    static int[][] transpose(int[][] matrix) {
        int[][] ans=new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                ans[i][j]=matrix[j][i];
            }
        }

        System.out.println(Arrays.deepToString(ans));
        return ans;
    }
}
