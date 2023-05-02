import java.util.*;

public class arraySort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("Before Sorting: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println("\nAfter Sorting: ");
        Arrays.sort(marks);
        for (int i = 0; i < 5; i++) {
            System.out.print(marks[i] + " ");
        }

        sc.close();
    }
}