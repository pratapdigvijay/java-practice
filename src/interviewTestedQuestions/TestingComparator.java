package interviewTestedQuestions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestingComparator {

	Comparator<Employee> comparator1 = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getName().compareTo(o2.getName());
		}
	};

	static Comparator<Employee> comparator2 = (Employee o1,
			Employee o2) -> (o1.getName().compareToIgnoreCase(o2.getName()));

	static Comparator<Employee> comparator3 = (o1, o2) -> (int) (o1.getSalary() - o2.getSalary());

	static Comparator<Employee> comparator4 = (o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary());

	static Comparator<Employee> reverseNameComparator = (e1, e2) -> e2.getName().compareTo(e1.getName());

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Ramesh", 450000, 30));
		employees.add(new Employee("John", 450000, 29));
		employees.add(new Employee("Tom", 450000, 30));
		employees.add(new Employee("Pramod", 400000, 29));

		// sorting using defined comparator based on name
		employees.stream().sorted(comparator2).forEach(f -> System.out.println(f));
		System.out.println();
		
		// sorting based on comparing salary directly
		employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
				.forEach(f -> System.out.println(f));
		System.out.println();
		
		// sorting based on salary if equals then on name
		employees.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).thenComparing(Employee::getName).reversed())
				.forEach(f -> System.out.println(f));
		
		
		System.out.println(118 & 15) ;	
		
		//checking max function to return max salary
		Employee employee = employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();
		System.out.println(employee);
		
		List<Integer> list = employees.stream().map(m -> m.getAge()).distinct().toList();
		System.out.println(list);
		
	}
}


class Employee {
	private String name;
	private double salary;
	private int age;
	
	public Employee(String name, double salary, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}
	
	
	
}