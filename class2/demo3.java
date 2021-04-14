package class2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
 * ArrayList
 * 1. non synchronized
 * 2. can contain duplicate elements
 * 3. maintain insertion order
 * 4. might slow while manipulating data
 *
 *
 * */

class Employee{
    public int empId;
    public String name;
    public int age;

    public Employee(int empId, String name, int age){
        this.empId = empId;
        this.name = name;
        this.age = age;
    }
}
public class demo3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list= new ArrayList<>();
		list.add("Agnes");
		list.add("gru");
		list .add("Scott");
		
		System.out.println(list);
		
		for(String name:list) {
			System.out.println(name);
		}
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		Iterator iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		ArrayList<String> colors = new ArrayList<>();
        colors.add("black");
        colors.add("white");
        colors.add("blue");

        // get
        System.out.println(colors.get(0));

        // set
        colors.set(0, "lightblue");
        System.out.println(colors.get(0));
        
        
        ArrayList<String> names = new ArrayList<>();
        names.add("ABCD");
        names.add("PQRS");
        names.add("XYZ");

        System.out.println("Before sorting....");
        for(String name : names){
            System.out.println(name);
        }

        Collections.sort(names);
        Collections.reverse(names);

        System.out.println("after sorting....");
        for(String name : names){
            System.out.println(name);
        }
        
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(78);
        numbers.add(56);
        numbers.add(45);

        System.out.println("Before sorting....");
        for(Integer number : numbers){
            System.out.println(number);
        }

        Collections.sort(numbers);
        //Collections.reverse(numbers);

        System.out.println("After sorting....");
        for(Integer number : numbers){
            System.out.println(number);
        }
        
        ArrayList<Employee> employees = new ArrayList<>();
        Employee emp1 = new Employee(1, "mark", 20);
        Employee emp2 = new Employee(2, "paul", 20);
        Employee emp3 = new Employee(3, "watson", 20);
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        for(Employee emp : employees){
            System.out.println("Employee: Id="+emp.empId+", Name="+emp.name+", Age="+ emp.age);
        }
	}

}

