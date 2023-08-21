//Reverse an given array

import java.util.Arrays;

public class rev_array {
    public static void main(String[] args) {
        int[] array1 = {2, 45, 62 ,4, 2};  
        reverse_array(array1);
        System.out.println(Arrays.toString(array1));
    }
  
    static void swap(int[] arr,int index1, int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
  
    static void reverse_array(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;

        }
    
    
    }
}
