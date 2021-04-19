package class3;

class Student {
	int id;
	String name;
	String email;

	public Student() {

	}

	public Student(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public void print() {
		System.out.println("id=" + id + " name=" + name + " email=" + email);
	}
}

public class demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stud = new Student(1, "name1", "e@gmail.com");
		Student stud1 = new Student();
		stud1.id = 2;
		stud1.name = "some name";
		stud.email = "some@some.com";
		
		stud.print();
		stud1.print();

	}

}
