package cloning;

class Student implements Cloneable{
    int rollno;
    String address;

    void printDetail(){
        System.out.println(rollno);
        System.out.println(address);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ShallowCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student amit = new Student();
        amit.rollno = 1001;
        amit.address = "Gkp";
        Student amit2 = (Student)amit.clone();
        amit2.rollno = 2001;
        amit2.address = "Agra";

        amit.printDetail();
        amit2.printDetail();
    }
}
