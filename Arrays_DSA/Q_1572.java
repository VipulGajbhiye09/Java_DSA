public class Q_1572 {
    public static void main(String[] args) {
        int[][] mat = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        diagonalSum(mat);
    }

    static int diagonalSum(int[][] mat) {
        int ans,pri_sum,sec_sum,mid_val;
        ans = pri_sum = sec_sum =mid_val= 0;
        int j =mat.length-1;

        for (int i = 0; i < mat.length; i++) {
            if (i==j){
               mid_val=mat[i][j];
            }
            pri_sum+=mat[i][i];
            sec_sum+=mat[i][j];
            j--;
        }
        System.out.println("pri_sum :"+pri_sum);
        System.out.println("sec_sum :"+sec_sum);
        System.out.println("mid_val :"+mid_val);

        ans=pri_sum+sec_sum-mid_val;
        System.out.println("ans :"+ans);

        return ans;
    }

}
