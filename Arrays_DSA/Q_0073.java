//Leetcode Medium 73.Set Matrix Zeroes
//Given an m x n integer matrix, if an element is 0, set its entire row and column to 0's.
//You must do it using "in place" algo.

public class Q_0073 {
    public static void main(String[] args) {
        int[][] matrix = {{3,7,8}, {9,11,13}, {15,16,17}};
        setZeroes(matrix);
    }

    static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            if (zeroRows[i]) {
                setRowZero(matrix, i);
            }
        }
        for (int j = 0; j < cols; j++) {
            if (zeroCols[j]) {
                setColZero(matrix, j);
            }
        }
    }
    
    static void setColZero(int[][] matrix,int col){
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col]=0;
        }
    }

    static void setRowZero(int[][] matrix,int row){
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[row][i]=0;
        }
    }
    static void printMatrix(int[][] matrix){
        System.out.println("Matrix :");
        for (int[]i:matrix) {
            for (int j:i) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
