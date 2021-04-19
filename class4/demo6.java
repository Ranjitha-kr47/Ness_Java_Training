package class4;

class Something {
	interface ISome {
		void test();
	}
}

class SomeTest implements Something.ISome {
	public void test() {
		System.out.println("test");
	}
}

public class demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SomeTest ch = new SomeTest();
		ch.test();

	}

}
