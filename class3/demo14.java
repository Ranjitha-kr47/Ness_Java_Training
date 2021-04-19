package class3;

/*
 * Method Overriding
 * > Method overriding is used to provide the specific implementation of a method which is already provided by super class
 * > If child class is not happy with the implementation of the parent class then it can override
 * > Method overriding is used for runtime polymorphism
 * > In this case we define multiple methods with the same name and same signature (parameters)
 * > This can be performed only between parent and child class and never can be performed with in class
 * > Overriding is all about changing the behaviour of the method
 *
 * */

class Employee2{
	public String firstName;
	public String lastName;
	
	public void getFullName() {
		System.out.println(firstName+" "+lastName);
	}
}

class FullTimeEmployee2 extends Employee2{
	@Override
	public void getFullName() {
	System.out.println(firstName+" "+lastName+"-full time");
}
}

class PartTimeEmployee2 extends Employee2{
	@Override
	public void getFullName() {
	System.out.println(firstName+" "+lastName+"-part time");
}
}
public class demo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FullTimeEmployee2 fte = new FullTimeEmployee2();
        PartTimeEmployee2 pte = new PartTimeEmployee2();

        fte.firstName = "Maggie";
        fte.lastName = "Smith";

        pte.firstName = "Daniel";
        pte.lastName = "Ron";

        fte.getFullName();
        pte.getFullName();

	}

}
