import java.util.*;

enum subject {
    Maths,
    English,
    Hindi;

}

public class enumeration {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        subject s1 = subject.valueOf(str);
        subject s2 = subject.English;
        System.out.println(s1 + " " + s2);
        sc.close();
    }

}
