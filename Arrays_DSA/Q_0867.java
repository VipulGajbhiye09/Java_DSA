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
