import java.util.Scanner;

class bitwise2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        //int ans = ~a;
        int ans2= a<<2;
        System.out.println("The output is: " + ans2);

        sc.close();

    }
}
