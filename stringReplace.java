import java.util.*;

public class stringReplace {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = "Raihan";
        System.out.println(s.length());
        String s2 = s.replace('i', 't');
        System.out.println(s + " " + s2); // original string remains same

        sc.close();
    }
}