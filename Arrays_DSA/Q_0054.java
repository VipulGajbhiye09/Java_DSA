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

        System.out.println(ans);
        return ans;
    }

}
