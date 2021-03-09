package collection_sorting;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private int age;
	
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public int compareTo(Employee o) {
//		return this.getId() - o.getId(); // ascending order
//		return o.getId() - this.getId(); // descending order
		if(this.getId() > o.getId()) {
			return 1;
		}
		else if(o.getId() > this.getId()) {
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
