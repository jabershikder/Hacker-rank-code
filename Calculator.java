import java.util.Scanner;

class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operands: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Choose any of the following option");
        System.out.println("Add: + ");
        System.out.println("Sub: - ");
        System.out.println("Multiply: * ");
        System.out.println("Divide: / ");
        char op = sc.next().charAt(0);

        switch (op) {

            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                System.out.println(a / b);
        }
        sc.close();

    }
}