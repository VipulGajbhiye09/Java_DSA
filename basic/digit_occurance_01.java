//Occurance of a digit in number

public class digit_occ {
    public static void main(String[] args) {
        int n = 1341144;  // input
        int count = 0;

        while (n>0){
            int rem = n % 10;
            if (rem==4){    //check occurance of digit 4
                count++;
            }
            n=n/10;
        }
        System.out.println(count); // output
    }
}
