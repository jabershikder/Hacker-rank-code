import java.util.Scanner;
class input1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count=5;
        int sum=0;
        int n;
        for(int i=0;i<count;i++){
            n=sc.nextInt();
            sum = sum+n;
        }
        float mean = (float)sum/count;  //typecasting to float
        System.out.println("Mean: "+mean);

        sc.close();

    }
    
}
