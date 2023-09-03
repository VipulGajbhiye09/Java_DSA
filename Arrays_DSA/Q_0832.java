//LeetCode Q 832 : Flipping an Image

import java.util.Arrays;

public class Q_832 {
    public static void main(String[] args) {
       int image[][]={{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};

       flipAndInvertImage(image);
    }
  
    static int[][] flipAndInvertImage(int[][] image) {
        int [][] ans = new int[image.length][];
        for (int i = 0; i < image.length; i++) {
            ans[i]=new int[image[i].length];
            int k = image[i].length-1;  //k pointer for reversal
            for (int j = 0 ; j< image[i].length ; j++) {
                ans[i][j]=flip(image[i][k]);
                k--;
            }
        }

        System.out.println(Arrays.deepToString(ans));
        return ans;
    }

    static int flip(int a){  //flips the bit
        if (a==0){
            return 1;
        }else{
            return 0;
        }
    }
}
