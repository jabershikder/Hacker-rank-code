import java.util.Scanner;

public class indexOf {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        String s = "aeiouAEIOU";
        System.out.println((s.indexOf(ch)>=0) ? "Vowel" : "Consonent");
        sc.close();
    }
}
