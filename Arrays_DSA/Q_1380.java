//Leetcode 1380. Lucky Numbers in a Matrix
//Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
//A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

public class Q_1380 {
    public static void main(String[] args) {
        int[][] matrix = {{3,7,8}, {9,11,13}, {15,16,17}};
        luckyNumbers(matrix);
    }

  static ArrayList<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>(2);


        return ans;
    }
    static int minOfRow(int[] arr){
        Arrays.sort(arr);
        int ans=arr[0];
        return ans;
    }
}
