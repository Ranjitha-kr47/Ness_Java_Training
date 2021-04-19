package class4;

class TestException extends Exception
{

}

public class demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArithmeticException ex = new ArithmeticException();
//      throw ex;

      throw new ArithmeticException();
      //throw new TestException();
	}

}
