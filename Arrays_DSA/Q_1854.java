//1854. Maximum Population Year
//given a 2D integer array logs where each logs[i] = [birth(i), death(i)] indicates the birth and death years of the ith person.
//The population of some year x is the number of people alive during that year.
// The ith person is counted in year x's population if x is in the inclusive range [birthi, deathi - 1]. 
// Note that the person is not counted in the year that they die.
//Return the earliest year with the maximum population.

public class Q_1854 {
    public static void main(String[] args) {
        int[][] logs = {{1993, 1999}, {2000, 2010}};

        maximumPopulation(logs);

    }
    static int maximumPopulation(int[][] logs) {
        int ans =0;
        
        return ans;
    }
}
