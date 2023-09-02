public class Q_1572 {
    public static void main(String[] args) {
        int[][] mat = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        diagonalSum(mat);
    }

    static int diagonalSum(int[][] mat) {
        int ans,pri_sum;
        ans = pri_sum = 0;
        int j =mat.length-1;

       //  primary sum
       for (int i = 0; i < mat.length; i++) {
           pri_sum+=mat[i][i];
       }
       System.out.println("pri_sum :"+pri_sum);

        return ans;
    }

}
