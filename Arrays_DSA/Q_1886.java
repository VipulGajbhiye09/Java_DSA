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
        int [][] ans = Arrays.copyOf(mat,mat.length);
        System.out.println("init :"+Arrays.deepToString(ans));
        for (int i = 0; i < 4; i++) {
            if (Arrays.deepEquals(ans, target)) {
                return true;
            }
            else {
                ans=transpose(ans);
                ans=flipMatrix(ans);
            }
            System.out.println(Arrays.deepToString(ans));
        }
    return false;
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

    static int[][] flipMatrix(int[][] matrix) {
        int [][] ans = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            if (ans[i]==null){
                ans[i]=new int[matrix[i].length];
            }
            int k = matrix[i].length-1;  //k pointer for reverse traversal
            for (int j = 0 ; j< matrix[i].length ; j++) {
                ans[i][j]=matrix[i][k];
                ans[i][k]=matrix[i][j];
                k--;
            }
        }
//        System.out.println(Arrays.deepToString(ans));
        return ans;
    }


}
