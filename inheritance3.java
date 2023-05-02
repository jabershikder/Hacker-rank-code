import java.util.*;

class university {
    Scanner sc = new Scanner(System.in);
    int reg_no;

    university() {
        System.out.println("Enter registration no: ");
        reg_no = sc.nextInt();

    }

    void print() {
        System.out.println("Reg No: " + reg_no);
    }
}

class details extends university {
    String name;
    char grade;

    details(int reg, String n, char g) {
        reg_no = reg;
        name = n;
        grade = g;
    }

    void print() {
        System.out.println("Reg No: " + reg_no);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }
}

class inheritance3 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String s = sc.nextLine();
        System.out.println("Enter grade: ");
        char ch = sc.next().charAt(0);
        System.out.println("Enter Reg_no: ");
        int reg = sc.nextInt();

        details d = new details(reg, s, ch);
        d.print();
        sc.close();
    }
}