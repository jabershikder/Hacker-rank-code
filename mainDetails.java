import java.util.Scanner;

class details {
    Scanner sc = new Scanner(System.in);
    String section;
    int roll_no;
    char grade;

    details() {
        section = "E2005";
        System.out.println("Enter roll_no: ");
        roll_no = sc.nextInt();
        System.out.println("Enter grade: ");
        grade = sc.next().charAt(0);

    }

    void print_data() {
        System.out.println("\nSection: " + section);
        System.out.println("Roll no: " + roll_no);
        System.out.println("Grade: " + grade);
    }
}

class mainDetails {
    public static void main(String args[]) {

        details d1 = new details();
        details d2 = new details();
        details d3 = new details();
        d1.print_data();
        d2.print_data();
        d3.print_data();

    }
}