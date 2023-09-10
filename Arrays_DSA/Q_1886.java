//Leetcode 1886. Determine Whether Matrix Can Be Obtained By Rotation
//Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating 
//matrix in 90-degree increments, or false otherwise.
//(1) Transpose matrix
//(2) Flip matrix along vertical symmetry line

public class Q_1886 {
    public static void main(String[] args) {
        int[][] mat = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] target = {{1, 1, 1}, {0, 1, 0}, {0, 0, 0}};
        findRotation(mat,target);
    }


    static boolean findRotation(int[][] mat, int[][] target) {
        boolean ans=true;

        
        return ans;
    }
    
    static int[][] transpose(int[][] matrix) {
            int[][] ans=new int[matrix[0].length][matrix.length];
            for (int i = 0; i < matrix[0].length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    ans[i][j]=matrix[j][i];
                }
            }
    //      System.out.println(Arrays.deepToString(ans));
            return ans;
        }







}
