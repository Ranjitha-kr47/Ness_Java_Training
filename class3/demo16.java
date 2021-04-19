package class3;

/*
 * Abstraction
 * > One of the main pillar of the OOPs
 * > A class which declare with abstract keyword is know as abstract class
 * > Abstract class can contain abstract as well as non abstract method
 * > Abstract method are method without the method body
 * > Only the abstract class can contain the abstract methods
 * > Abstract class consider as incomplete hence we cannot able to create instance of the abstract class
 * > Abstract class can always be super class
 * > The class which derived from the abstract class responsable to provide the implementation of all abstract methods
 * > A non abstrac class derived from the abstract class must provide the implementation of all abstract method
 * > Abstract method cannot have body or implementation and we try to do so it will be an compile time error
 * > Only abstract class can contain abstract method
 *
 * */
abstract class ParentDemo{
	public void AddNumber(int a, int b) {
		System.out.println("Sum="+(a+b));
	}
	public void SubNumber(int a, int b) {
		System.out.println("Diff="+(a-b));
	}
	
	public abstract void MulNumber(int a,int b);
	public abstract void DivNumber(int a,int b);
}

class ChildDemo extends ParentDemo{
	public void MulNumber(int a,int b) {
		System.out.println("product="+(a*b));
	}
	public void DivNumber(int a,int b) {
		System.out.println("division="+(a/b));
	}
}

public class demo16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildDemo obj = new ChildDemo();
        obj.AddNumber(40,70);
        obj.SubNumber(40,70);
        obj.MulNumber(40,70);
        obj.DivNumber(40,20);
	}

}
