package class3;

class Parent2{
	public void test1() {
		System.out.println("parent test");
	}
}

class Child2 extends Parent2{
	public void test1(int a) {
		System.out.println("child test");
	}
}
public class demo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 ch=new Child2();
		ch.test1();
		ch.test1(10);
	}

}
