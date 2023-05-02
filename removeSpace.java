import java.util.Scanner;

public class removeSpace {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int s=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                s=i;
                break;
            }
        }
        int e=str.length();
        for(int i=str.length()-1;i>0;i--){
            if(str.charAt(i)!=' '){
                e=i;
                break;
            }
        }
        String str2 = "";
        for(int i=s;i<=e;i++){
            str2=str2+str.charAt(i);
        }
        System.out.println(str2);
        sc.close();
    }
}
