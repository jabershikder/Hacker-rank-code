import java.util.*;

class bitsTochar {
    static int bintoDec(String n) {

        String num = n;

        // Stores the decimal value
        int dec_value = 0;

        // Initializing base value to 1
        int base = 1;

        int len = num.length();
        for (int i = len - 1; i >= 0; i--) {

            // If the current bit is 1
            if (num.charAt(i) == '1')
                dec_value += base;
            base = base * 2;
        }

        // Return answer
        return dec_value;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int dec = bintoDec(str);
        if (dec >= 65 && dec <= 90) {
            char ch = (char) dec;
            System.out.println(ch);
        } else {
            System.out.println("INVALID PAPER CODE");
        }

        sc.close();

    }
}