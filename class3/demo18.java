package class3;

abstract class A1{
	abstract void test();
}

abstract class A2 extends A1{
	abstract void test1();
}
abstract class A3 extends A1{
	abstract void test2();
}
class DemoChild extends A3{
	void test() {
		
	}
	void test1() {}
	void test2() {}
}
public class demo18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
