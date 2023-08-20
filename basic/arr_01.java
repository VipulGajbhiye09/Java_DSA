import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        //input
        for (int i=0;i<arr.length;i++){
            arr[i]= in.nextInt();
        }
      
      //output
       for (int i=0;i<arr.length;i++){
           System.out.print( arr[i] +" ");
       }
    }
}
