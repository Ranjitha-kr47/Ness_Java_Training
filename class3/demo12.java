package class3;
/*
 * Polymorphism
 * > This is one of main pillar of OOPs
 * > Poly(Many) + Morph(Shape)
 * >
 * Polymorphism can be of two type
 * 1. Static / Compiler
 * 2. Dynamic / RunTime
 *
 * Method Overloading - static
 * Method Overriding - dynamic
 *
 * # Method Overloading
 * > In this case we define multiple method with same name by different parameters
 * > This is can be performed either within a class as well as between parent and child class
 * > Method overloading is all about defining multiple or adding behaviour to a method
 *
 * # Conditions for method overloading
 * 1. different number of parameters
 * 2. different type of parameters
 * 3. different order of parameters
 * 4. different return type - not valid
 *
 * */

public class demo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "welcome minion";
        message.indexOf('o');  //4
        message.indexOf('o', 5);  //12
        message.indexOf("mi");  //8

        System.out.println(message.indexOf('o'));
        System.out.println(message.indexOf('o', 5));
        System.out.println(message.indexOf("mi"));
	}

}