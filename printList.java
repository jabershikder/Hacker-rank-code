import java.util.*;

class Inlist {
    protected int[] list;
    protected int numElements = 0;
    int n = 0;

    Inlist(int size) {
        list = new int[size];
    }

    void add(int val) {
        if (n < list.length) {
            list[n] = val;
            n++;
        } else {
            System.out.println("Error: List is full");
        }
    }

    String toStr() {

        String s = Arrays.toString(list);
        s = s.replaceAll(" ", "");
        s = s.replace("[", "");
        s = s.replace("]", "");

        return s;
    }
}

class printList {
    public static void main(String args[]) {
        int n = 3;
        Inlist l1 = new Inlist(n);
        l1.add(2);
        l1.add(5);
        l1.add(10);
        l1.add(12);
        String s = l1.toStr();
        int j = 0;
        System.out.print("Index " + j + ": " + s.charAt(0));
        j++;
        for (int i = 1; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            if (s.charAt(i) == ',') {
                System.out.print("\nIndex " + j + ": ");
                j++;
            }

        }

    }
}
