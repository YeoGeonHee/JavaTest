package chapter08;

public class Student2 {
	String name;
	int grade;
	String department;
	
	public Student2() {
		
	}

	public Student2(String name, int grade, String department) {
		super();
		this.name = name;
		this.grade = grade;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student2 [name=" + name + ", grade=" + grade + ", department=" + department + "]";
	}
	
	
	

}
