import java.util.Arrays;

public class Q_867 {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        transpose(matrix);
    }

    static int[][] transpose(int[][] matrix) {
        int[][] ans=new int[matrix.length][];

        for (int i = 0; i < matrix.length; i++) {
            ans[i]=new int[matrix[i].length];
            for (int j = 0; j < matrix[i].length; j++) {
                ans[i][j]=matrix[i][j];
            }
        }

        System.out.println(Arrays.deepToString(ans));


        return ans;
    }
}

