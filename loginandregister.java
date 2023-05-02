import java.util.HashMap;
import java.util.*;

public class loginandregister {

    private static HashMap<String, String> userDatabase = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isLoggedIn = false;
        userDatabase.put("12007836", "raihan");
        while (!isLoggedIn) {
            System.out.println("Enter 1 to login or 2 to register: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume the new line character

            switch (choice) {
                case 1:
                    isLoggedIn = login();
                    break;
                case 2:
                    register();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();

        System.out.println("Login successful!");
    }

    private static boolean login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = sc.nextLine();
        System.out.println("Enter your password: ");
        String password = sc.nextLine();
        sc.close();
        if (userDatabase.containsKey(username) && userDatabase.get(username).equals(password)) {
            return true;
        } else {
            if (userDatabase.containsKey(username)) {
                System.out.println("Incorrect password");
            } else {
                System.out.println("Invalid username");
            }

            return false;
        }

    }

    private static void register() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a username: ");
        String username = sc.nextLine();

        if (userDatabase.containsKey(username)) {
            System.out.println("Username already exists.");
        } else {
            System.out.println("Enter a password: ");
            String password = sc.nextLine();
            userDatabase.put(username, password);
            System.out.println("Registration successful.");
        }
        sc.close();
    }
}
