package class4;


public class demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=4;
        int b=0;
        int c=1;
        try {
        	 c=a/b;
        }
        
        catch(ArithmeticException ex) {
        	//System.out.println(ex.getMessage());
        	System.out.println("cannot divide the number by 0");
        }
        catch(Exception ex) {
        	System.out.println(ex.getMessage());
        }
        
        System.out.println("result:"+ c);
	}

}
