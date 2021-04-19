package class3;
/*
 * Static and non static class members
 * When a class member include a static keyword that member is called static
 * When no static keyword is used is called non static
 *
 * Static members are invoke using class name where as instance members are
 * invoke using class object or instance
 *
 * */
class Calculator {
	int a, b;
	public static int c;

	public  Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	static  {
		c=13;
	}

	public void Addition(int a, int b) {
		System.out.println(a + b);
	}

	public void Subtraction(int a, int b) {
		System.out.println(a - b);
	}

	public static void Multiplication(int a, int b) {
		System.out.println(a * b);
	}

	public static void Division(int a, int b) {
		System.out.println(a / b);
	}

	public void print() {
		System.out.println("a=" + a + " b=" + b);
	}
}

public class demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator(40, 30);
		cal.Addition(40, 30);
		cal.Subtraction(40, 30);

		Calculator.Multiplication(40, 30);
		Calculator.Division(40, 30);

		cal.print();
	}

}
