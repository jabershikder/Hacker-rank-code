import java.util.*;


public class changeTense {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        if(s.indexOf("is")>=0 || s.indexOf("are")>=0 || s.indexOf("am")>=0){
            s=s.replace("is","was");
            s=s.replace("am", "was");
            s=s.replace("are", "were");
        }
        System.out.println(s);

        sc.close();



    }
}
