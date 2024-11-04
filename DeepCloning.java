package cloning;

class Student2 implements Cloneable{
    int rollno;
    Address address;

    void printDetail(){
        System.out.println(rollno);
        System.out.println(address);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student2 student = (Student2) super.clone();
        student.address = (Address) address.clone();
        return student;
    }
}
class Address implements Cloneable{
    int addressId;
    int pinCode;

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", pinCode=" + pinCode +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class DeepCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student2 std1 = new Student2();
        std1.rollno = 2001;
        Address add1 = new Address();
        add1.addressId = 1;
        add1.pinCode = 273306;
        std1.address = add1;

        Student2 std2 =  (Student2) std1.clone();
        std1.printDetail();
        std2.printDetail();
        std1.rollno = 1001;
        std1.address.pinCode = 308820;
        std1.address.addressId = 2;
        System.out.println("---------------------");
        std1.printDetail();
        std2.printDetail();

    }
}
