package class4;

interface IParent1 {
	void print();
}

interface IParent2 {
	void print();
}

class Child implements IParent1, IParent2 {
	public void print() {
		System.out.println("Print-parent1");
	}

	public void display() {
		System.out.println("display-parent2");
	}
}

public class demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.print();
		child.display();
	}

}
