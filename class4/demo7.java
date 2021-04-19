package class4;
/*
 * Encapsulation
 * It is all about wrapping your code into single unit
 * With the help of encapsulation we can decide what level visibility we would like to provide to the class members
 *
 * Type of modifiers
 * 1. Access Modifiers
 * 2. Non Access Modifiers
 *
 * There are 4 access modifiers
 * 1. private - It cannot be access outside the class
 * 2. public - access level public means visible or accessable to everywhen everywhere
 * 3. protected -  within the package and outside the package through child class
 * 4. default - only with in a same package
 *
 * */

//class Student {
//	private int id;
//	private String name;
//	private int passMarks = 40;
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) throws Exception {
//		if (id < 0) {
//			System.out.println("id cannot be empty");
//		}
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) throws Exception {
//		if (name.isEmpty()) {
//			System.out.println("name cannot be empty");
//		}
//		this.name = name;
//	}
//
//	public int getPassMarks() {
//		return passMarks;
//	}
//}
//
//class demo7 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Student stud = new Student();
//	student.setId(1);
//	student.setName("some");
//
//		System.out.println("Student: Id=" + student.getId() + ", Name=" + student.getName() + ", Pass Marks="
//				+ student.getPassMarks());
//
//	}
//
//}

class Student{
    private int id;
    private String name;
    private int passMarks = 40;

    public int getId() {
        return id;
    }

    public void setId(int id) throws Exception {
        if(id <0){
            throw new Exception("Id cannot be negative");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if(name.isEmpty())
            throw new Exception("Name cannot be empty");
        this.name = name;
    }

    public int getPassMarks() {
        return passMarks;
    }

}

public class demo7 {
    public static void main(String[] args) throws Exception {
        Student student = new Student();
        student.setId(1);
        student.setName("Mark");


        System.out.println("Student: Id="+ student.getId()+", Name="+ student.getName()+", Pass Marks="+student.getPassMarks());
    }
}
