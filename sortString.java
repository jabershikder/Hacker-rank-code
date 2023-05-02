import java.util.*;
public class sortString {
    public static void main(String args[]){
        String s ="JAVA";
        char ch[] = s.toCharArray();
        Arrays.sort(ch);   //or we can we use any sorting method like bubble sort
        s="";
        for(char c : ch){
            s=s+c;
        }
        System.out.println(s);

    }
    
}
