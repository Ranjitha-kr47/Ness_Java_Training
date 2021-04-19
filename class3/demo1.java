package class3;

/*
 * Class
 * When we define a class we define a blue print for data type
 * this does not actually mean any data but it does define what the class name means
 * what class consist of what operation can be performed on object
 * The method and variables that consitute a class are called as members of the class
 *
 * Define a class
 * <access modifier> class <class Name>{
 *      // member variable
 *     <access modifier> <data_type> <variable_name>
 *      // member function
 *     <access modifier> <return type> <method_name>(parameter){
 *         // body
 *     }
 * }
 * access modifier specify the access rule for member as well as class by default it is default and for members it is private
 * data type specify the type of variable and return type specify the data type of the method return rules
 * to access the class members we use (.) operator
 *
 * Java is case sensitive
 * Every line should end with semicolon
 * main is main entry point for you java program
 *
 * DRY - Do not Repeat Yourself
 *
 * */
class Book {
	private String title;
	private String author;
	private int price;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void print() {
		System.out.println("Book: Title=" + title + ", Author=" + author + ", Price=" + price);
	}
}

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	    Book obj1=new Book();
//	    obj1.title="title 1";
//	    obj1.author="author 1";
//	    obj1.price=1000;
//	    
//	    Book obj=new Book();
//	    obj.title="title 2";
//	    obj.author="author 2";
//	    obj.price=2000;
//	    
//	    System.out.println("Book: Title="+ obj1.title+", Author="+ obj1.author+", Price="+ obj1.price);
//	    System.out.println("Book: Title="+ obj.title+", Author="+ obj.author+", Price="+ obj.price);

		Book obj = new Book();
		obj.setTitle("title 1");
		obj.setAuthor("author 1");
		obj.setPrice(1000);

		Book obj1 = new Book();
		obj1.setTitle("title 2");
		obj1.setAuthor("author 2");
		obj1.setPrice(2000);

		obj.print();
		obj1.print();
	}

}
