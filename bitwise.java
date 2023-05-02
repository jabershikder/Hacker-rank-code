import java.util.Scanner;

class bitwise {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = a & b;
        System.out.println("The output is: " + ans);

        sc.close();

    }
}
