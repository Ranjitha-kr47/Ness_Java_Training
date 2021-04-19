package class4;

class EncapsulationDemo1{
	public void publicMethod(){
        System.out.println("public method");
    }

    private void privateMethod(){
        System.out.println("private method");
    }

    protected void protectedMethod(){
        System.out.println("protected method");
    }

}
public class demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationDemo enc = new EncapsulationDemo();
        enc.protectedMethod();
        enc.publicMethod();
	}

}
