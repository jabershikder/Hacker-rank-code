/* for input
nextLine()
nextBoolean()
nextByte()
nextDouble()
nextFloat()
nextInt()
nextLong()
nextShort()
next().charAt(0)
*/
import java.util.Scanner;

class employee{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        String name;
        int age;
        float salary;
        char grade;
        System.out.println("Enter Name: ");
        name = obj.nextLine();
        System.out.println("Enter age: ");
        age = obj.nextInt();
        System.out.println("Enter Salary: ");
        salary = obj.nextFloat();
        System.out.println("Enter Grade: ");
        grade = obj.next().charAt(0);

        System.out.println("Name: "+ name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
        System.out.println("Grade: "+grade);

        obj.close();
    }
}
