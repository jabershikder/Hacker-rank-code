import java.util.*;

public class balancedParen {

    public static boolean isBalanced(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                } else {
                    return false;
                }
            } else if (s.charAt(i) == '}') {
                if (!st.isEmpty() && st.peek() == '{') {
                    st.pop();
                } else {
                    return false;
                }
            } else if (s.charAt(i) == ']') {
                if (!st.isEmpty() && st.peek() == '[') {
                    st.pop();
                } else {
                    return false;
                }
            }

        }
        if (st.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            System.out.println((isBalanced(s)) ? "true" : "false");
        }
        sc.close();

    }
}
