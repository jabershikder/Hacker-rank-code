import java.util.*;

public class sortArray_remvDup {

    static int removeDuplicates(int arr[], int n) {
        if (n == 0 || n == 1)
            return n;

        int j = 0;

        for (int i = 0; i < n - 1; i++)
            if (arr[i] != arr[i + 1])
                arr[j++] = arr[i];

        arr[j++] = arr[n - 1];

        return j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 5 && n <= 15) {

            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int choice = sc.nextInt();
            if (choice == 1) {
                Arrays.sort(arr);
                n = removeDuplicates(arr, n);
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }

            } else if (choice == 2) {
                Arrays.sort(arr);
                n = removeDuplicates(arr, n);
                for (int i = n - 1; i > 0; i--) {
                    System.out.print(arr[i] + " ");
                }

            } else {
                System.out.print("Invalid Input");
            }
        } else {
            System.out.print("Invalid");
        }
        sc.close();
    }
}