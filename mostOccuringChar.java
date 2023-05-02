import java.util.*;

public class mostOccuringChar {
    public static char mostOccChar(String str) {
        int[] charArr = new int[122];
        int maxOcc = 0;
        char mostOccCh = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charArr[ch]++;
            if (charArr[ch] > maxOcc || (charArr[ch] == maxOcc && ch < mostOccCh)) {
                maxOcc = charArr[ch];
                mostOccCh = ch;
            }
        }
        return mostOccCh;
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("Maximum occurring character is: " + mostOccChar(s));
        sc.close();

    }
}