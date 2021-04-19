package class3;

/*constructor overloading*/


class Book1 {
	private String title;
	private String author;
	private int price;

	public Book1(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public void print() {
		System.out.println("Book: Title=" + title + ", Author=" + author + ", Price=" + price);
	}
}

public class demo2 {

	public static void main(String[] args) {
		Book1 obj = new Book1("title1", "author1", 1000);
		Book1 obj1 = new Book1("title2", "author2", 2000);

		obj.print();
		obj1.print();

		// TODO Auto-generated method stub

	}

}
