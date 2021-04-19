package class4;

interface I1 {
	void test();
}

interface I2 extends I1 {
	void test1();
}

interface I3 extends I2 {
	void test2();
}

class Test implements I3 {
	public void test() {
		System.out.println("Test");
	}

	public void test1() {
		System.out.println("Test1");
	}

	public void test2() {
		System.out.println("Test2");
	}
}

public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		test.test();
		test.test1();
		test.test2();
	}

}
