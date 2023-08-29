//LeetCode Q 1431 : kids with candies
//There are n kids with candies. You are given an integer array candies,
//where each candies[i] represents the number of candies the ith kid has
//and an integer extraCandies, denoting the number of extra candies that you have.
//Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies,
//they will have the greatest number of candies among all the kids, or false otherwise.
//Note that multiple kids can have the greatest number of candies.
import java.util.ArrayList;

public class Q_1431 {
    public static void main(String[] args) {
        int[] candies= {2,3,5,1,3};
        int extraCandies=3;

        kidsWithCandies(candies,extraCandies);
    }
    static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<>(5);
        int max_candies=candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i]>max_candies){
                max_candies=candies[i];
            }
        }
        System.out.println("max_candies : "+max_candies);

        for (int i: candies) {
            if (i+extraCandies>=max_candies){
                result.add(true);
            }else {
                result.add(false);
            }
        }
        System.out.println(result);

        return result;
    }
}
