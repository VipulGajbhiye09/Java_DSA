import java.util.Arrays;

public class Q_832 {
    public static void main(String[] args) {
       int image[][]={{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};

       flipAndInvertImage(image);
    }

    static int[][] flipAndInvertImage(int[][] image) {

        int [][] ans = new int[image.length][];



        System.out.println(Arrays.toString(ans));
        return ans;
    }


    static int flip(int a){
        if (a==0){
            a=1;
        }else{
            a=0;
        }
        return a;
    }
}
