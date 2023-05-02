class Address{
    String city,state;
    public Address(String city, String state){
        this.city=city;
        this.state=state;
    }
}

class student{
    int rollno;
    String name;
    Address address;

    public student(int rollno, String name, Address address){
        this.rollno=rollno;
        this.name = name;
        this.address = address;
    }
    void show(){
        System.out.println(rollno+" "+name);
        System.out.println(address.city+" "+address.state);
    }

}
public class aggregation {
    public static void main(String args[]){
        Address obj1=new Address("Jalandhar", "Punjab");
        student obj2 =new student(10, "aa",obj1);
        obj2.show();
    }
    
}
