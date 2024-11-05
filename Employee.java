package clonning;

public class Employee implements Cloneable{
	private int empId;
	private String name;
	private String department;
	
	public void print() {
		System.out.println("EmpID: "+empId);
		System.out.println("Name: "+name);
		System.out.println("Department: "+department);
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	protected Employee clone() throws CloneNotSupportedException{
		return (Employee) super.clone();
	}
}

class Main{
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1 = new Employee();
		e1.setEmpId(111);
		e1.setName("Amit Singh");
		e1.setDepartment("Programmer Trainee");
		e1.print();
		
		Employee e2 = e1.clone();
		e2.setName("Shobhit");
		e2.setEmpId(222);
		e2.print();
		
	}
}