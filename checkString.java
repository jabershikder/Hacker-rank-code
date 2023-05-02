import java.util.*;

class checkString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine();
        int len = s.length();
        System.out.println("Number of characters: " + len);

        int vowelCnt = 0;
        for (int i = 0; i < len; i++) {
            // if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
            //         || s.charAt(i) == 'u') {
            //     vowelCnt++;
            // }
            //using ternary operator
            vowelCnt = (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') ? vowelCnt+1 : vowelCnt;
        }

        if (len >= 5 && vowelCnt == 2) {
            System.out.println("Good String");
        } else {
            System.out.println("Bad String");
        }

        sc.close();
    }
}