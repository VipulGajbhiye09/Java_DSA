//LeetCode Q 1672 : Richest Customer Wealth
// You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank
// Return the wealth that the richest customer has.
//
//        A customer's wealth is the amount of money they have in all their bank accounts.
//        The richest customer is the customer that has the maximum wealth.
//        Input: accounts = [[1,2,3],[3,2,1]]
//        Output: 6
//        Explanation:
//        1st customer has wealth = 1 + 2 + 3 = 6
//        2nd customer has wealth = 3 + 2 + 1 = 6
//        Both customers are considered the richest with a wealth of 6 each, so return 6.
public class Q_1672 {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 5},
                {7, 3},
                {3, 5}
        };

        maximumWealth(accounts);
    }
    static int maximumWealth(int[][] accounts) {
        int[] wealth=new int[accounts.length];
        int max_wealth=0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                wealth[i] += accounts[i][j];
            }
            System.out.println("wealth of "+ (i+1) +" = "+ wealth[i]);
            if (max_wealth < wealth[i]){
             max_wealth=wealth[i];
            }
        }
        System.out.println("max_wealth : "+max_wealth);
        return max_wealth;
    }
}
