import java.util.*;

class checkChar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char c = sc.next().charAt(0);

        // using ternary operator
        System.out.println(
                (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? "Its a Vowel" : "Its a consonant");

        sc.close();
    }
}
