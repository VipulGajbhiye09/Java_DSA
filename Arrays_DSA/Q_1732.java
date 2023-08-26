//LeetCode Q 1732 : Find the Highest Altitude
//There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes.
//The biker starts his trip on point 0 with altitude equal 0.
//You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i and i + 1 for all (0 <= i < n).
// Return the highest altitude of a point.

public class Q_1732 {
    public static void main(String[] args) {
        int[] gain = {-4, -3, -2, -1, 4, 3, 2};
        largestAltitude(gain);
    }

    static int largestAltitude(int[] gain) {
        int highest_alt=0;
        int lowest_alt =0;
        int current_alt=0;

        for (int i = 0; i < gain.length; i++) {
            current_alt+=gain[i];
            if (current_alt>highest_alt){
                highest_alt=current_alt;
            }
            if (current_alt<lowest_alt){
                lowest_alt=current_alt;
            }
        }
        System.out.println("highest_alt : "+highest_alt);
        System.out.println("lowest_alt : "+lowest_alt);
        return highest_alt;
    }
}
