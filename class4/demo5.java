package class4;

interface ICompany {
	void getEmployee();

	default void getCompanyInfo() {
		System.out.println("company info");
	}
}

class Employee1 implements ICompany {
	public void getEmployee() {
		System.out.println("employee info");
	}
}

public class demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 employee = new Employee1();
		employee.getEmployee();
		employee.getCompanyInfo();
	}

}
