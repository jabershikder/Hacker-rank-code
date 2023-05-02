import java.util.Scanner;

public class replaceChar {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char str[] = s.toCharArray();
        char ch = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        for(int i=0;i<str.length;i++){
            if(str[i]==ch){
                str[i]=ch2;
            }
        }
        s="";
        for(int i=0;i<str.length;i++){
            s=s+str[i];
        }
        System.out.println(s);
        sc.close();

    }
}
