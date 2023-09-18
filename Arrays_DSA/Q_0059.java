import java.util.Arrays;

public class Q_0059 {
    public static void main(String[] args) {
        generateMatrix(3);
    }
    static int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][];
        int top,left,bottom,right,count;
        count=1;
        top=left=0;
        bottom=right=n-1;
        while (top<=bottom && left<=right){
            for (int i = left; i <=right; i++) {
                if(matrix[top]==null){
                    matrix[top]=new int[n];
                }
                matrix[top][i]=count;
                count++;
            }
            top++;
            for (int i = top; i <=bottom ; i++) {
                if(matrix[i]==null){
                    matrix[i]=new int[n];
                }
                matrix[i][right]=count;
                count++;
            }
            right--;
            if (top<=bottom){
                for (int i = right; i>=left; i--) {
                    matrix[bottom][i]=count;
                    count++;
                }
            }
            bottom--;
            if (left<=right){
                for (int i = bottom; i>=top; i--) {
                    matrix[i][left]=count;
                    count++;
                }
                left++;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        return matrix;
    }
}
