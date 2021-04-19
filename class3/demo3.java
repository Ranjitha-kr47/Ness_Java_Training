package class3;

/*
 * Constructors
 * > It is a special method present under a class responsable for initializing the member variables of class
 * > The name of a constructor is exactly the same name of the class in which it was present
 * > Each and every class require constructor if we want to create the instance of that class
 * > It is a responsibility of a programmer to define a constructor but if he fail than on behalf of the programmer
 *   compiler will create a constructor and these constructor are known as implicit constructor
 * > Implicit constructor are also known as default constructor and they are always parameter less
 * > Implicit constructor are define public
 * > we can also define constructor under the class these constructor are called explicit constructor and can be
 *   parameter less or with parameter
 * > A class can have more then one constructor which is know as constructor overloading
 *
 * # Type of Constructor
 * 1. Default or Parameterless Constructor
 * 2. Paramterized constructor
 * 3. Copy constructor
 * 4. Static constructor
 *
 * Default constructor does not take any parameters and can be defined by programmer or else will be define implicitly by compiler
 *
 * Parameterized constructor is define with any parameter and these constructor can only be define by programmer only and never define implicitly
 *
 * Copy constructor is to create multiple instance with the same values then we can use copy constructor. In a copy constructor
 * the constructor takes the same values as a parameters to it
 * */

class Test {
	// implicit/ default constructor
	public Test() {

	}
}

class Test1 {
	// parametarised or explicit constructor
	public Test1(int x, int y) {

	}

}

class Test2 {
	int p, q, r, s;

	public Test2(int p, int q, int r, int s) {
		this.p = p;
		this.q = q;
		this.r = r;
		this.s = s;
	}

	public Test2(Test2 obj) {
		this.p = obj.p;
		this.q = obj.q;
		this.r = obj.r;
		this.s = obj.s;
	}

	public void print() {
		System.out.println("p=" + p + " q=" + q + " r=" + r + " s=" + s);
	}
}

public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test testObj = new Test();
		Test1 test1Obj = new Test1(10, 20);

		Test2 test3Obj = new Test2(10, 20, 30, 40);
		Test2 test3Obj2 = new Test2(test3Obj);

		test3Obj.print();

	}

}
