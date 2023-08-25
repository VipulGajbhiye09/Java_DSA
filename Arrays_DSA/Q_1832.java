//Leetcode Q 1832. Check if the Sentence Is Pangram
//A pangram is a sentence where every letter of the English alphabet appears at least once.
//Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
import java.util.Arrays;
public class Q_1832 {
    public static void main(String[] args) {
        String sentence = "uwqohxamknblecdtzpisgvyfjr";
        checkIfPangram(sentence);
    }
    static boolean checkIfPangram(String sentence) {
        boolean ans=false;
        int[] arr= new int[26];
        if(sentence.length()<26){
            return false;
        }
        for (int i = 0; i < sentence.length(); i++) {
                int j=sentence.charAt(i)-97;  //ASCII for a to z : 97 to 122
                arr[j]=1;
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]!=1){
                ans=false;
                break;
            }else {
                ans=true;
            }
        }
        System.out.println(ans);
        System.out.println(sentence);
        System.out.println(sentence.length());

        return ans;
    }
}
