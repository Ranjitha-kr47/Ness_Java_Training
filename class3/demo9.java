package class3;

class Parent{
	public Parent(int x) {
		System.out.println("parent class:"+x);
	}
}

class Child extends Parent{
	public Child(int a) {
		super(a);
		System.out.println("child class");
	}
}


public class demo9 {

	public static void main(String[] args) {
		Child child =new Child(47);
		
		
		// TODO Auto-generated method stub

	}

}
