//Leetcode 1380. Lucky Numbers in a Matrix
//Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
//A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

public class Q_1380 {
    public static void main(String[] args) {
        int[][] matrix = {{3,7,8}, {9,11,13}, {15,16,17}};
        luckyNumbers(matrix);
    }

  public static ArrayList<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int minRow = minOfRow(matrix[i]);
            int col = indexOfMin(matrix[i]);

            if (minRow == maxOfCol(matrix, col)) {
                ans.add(minRow);
            }
        }

        System.out.println(ans);
        return ans;
    }

    static int minOfRow(int[] arr){
        Arrays.sort(arr);
        int ans=arr[0];
        return ans;
    }
    static int indexOfMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
    static int maxOfCol(int[][] mat,int col){
        int [] arr = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            arr[i]=mat[i][col];
        }
        Arrays.sort(arr);
        int ans=arr[mat.length-1];
        return ans;
    }
}
