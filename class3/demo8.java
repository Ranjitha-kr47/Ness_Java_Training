package class3;
class Test3{
	static int a;
	
	static {
		a=20;
	}
	
	public Test3(){
        System.out.println("Default constructor");
    }
}
public class demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 obj = new Test3();
        //obj.Test4();
	}

}
