import java.util.*;

public class wordsWithGivenLength {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int num = sc.nextInt();
        String str[] = s.split(" ");
        int cnt = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() == num) {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}