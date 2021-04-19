package class3;

/*
 * OOPs - Object Oriented Programming
 * 4 main pillers  / principal of OOPs
 * 1. Inheritance
 * 2. Polymorphism
 * 3. Abstraction
 * 4. Encapsulation
 *
 * Inheritance
 * > It is a mechanism of consuming the members of one class in another class by
 *   eastablishing prent/ child class relationship between the class
 * > encourage code re-usability
 *
 * Employee => Parent / Base / Super
 * FTE => Child / Derived/ sub
 *
 * > In inheritance child class can consume members of its parent as it is owner of those
 *   members (except the private member of the parent class)
 *
 * > Parent class constructor must be accessaible to the child class otherwise inheritance will not be possible
 *
 * > In inheritance child class can access parent class members but parent class can never access any member that define
 *   in child class
 *
 *  Advantage
 * 1. Code resuability
 * 2. Reduce Error
 * 3. Reduce Time
 * 4. More Maintanable Code
 *
 *
 * Type of Inheritance
 * 1. Simple / Single
 * 2. MultiLevel
 * 3. Hierarchical
 * 4. Multiple
 * 5. Hybrid
 *
 * */

class Employee{
	public int empId;
	public String firstName;
	public String lastName;
	public String email;
	public int age;
	
	public void getFullName() {
		System.out.println(firstName+" "+lastName);
	}
}

class FullTimeEmployee extends Employee{
	public int annualSalary;
}
class PartTimeEmployee extends Employee{
	public int hourlySalary;
}
public class demo7 {

	public static void main(String[] args) {
		FullTimeEmployee fte=new FullTimeEmployee();
		fte.firstName="Maggie";
		fte.lastName="Smith";
		fte.email="m@gmail.com";
		fte.age=23;
		fte.annualSalary=23000;
		
		PartTimeEmployee pte=new PartTimeEmployee();
		pte.firstName="Daniel";
		pte.lastName="Smith";
		pte.email="m@gmail.com";
		pte.age=23;
		pte.hourlySalary=98000;
		
		fte.getFullName();
		pte.getFullName();
		// TODO Auto-generated method stub

	}

}
