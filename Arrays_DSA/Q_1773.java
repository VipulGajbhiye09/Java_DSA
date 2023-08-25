//Leetcode Q_1773 Count Items Matching a Rule
//You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item.
//You are also given a rule represented by two strings, ruleKey and ruleValue.
//The ith item is said to match the rule if one of the following is true:
//ruleKey == "type" and ruleValue == typei.
//ruleKey == "color" and ruleValue == colori.
//ruleKey == "name" and ruleValue == namei.
// Return the number of items that match the given rule.

import java.util.Arrays;

public class Q_1773 {
    public static void main(String[] args) {
        String[][] items={{"phone","blue", "pixel"}, {"computer", "silver", "lenovo"}, {"phone", "gold", "iphone"}};
        countMatches(items,"type", "phone");
    }
    static int countMatches(String[][] items, String ruleKey, String ruleValue) {
        int count=0;

        for (int i = 0; i < items.length; i++) {
            String[] data=new String[items[i].length];
            int a;
//            System.out.println(Arrays.toString(items[i]));
            for (int j = 0; j < items[i].length; j++) {
                data[j]=items[i][j];
//              System.out.println(items[i][j]);
            }
            if (ruleKey.equals("type")){
                a=0;
            } else if (ruleKey.equals("color")) {
                a=1;
            }else {
                a=2;
            }
            if (data[a].equals(ruleValue)){
                count++;
            }

            System.out.println(Arrays.toString(data));
        }
        System.out.println(count);
//        System.out.println(Arrays.deepToString(items)+" "+ruleKey+" "+ruleValue);
        return count;
    }
}
