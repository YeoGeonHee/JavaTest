package chapter08;

public class StudentMain {

	public static void main(String[] args) {
		Student stu1 = new Student(); // 기본 생성자
	    // 필드 초기화
	    stu1.name = "홍길동";
	    stu1.grade = 3;
	    stu1.department = "자바";

	    Student stu2 = new Student(); // 기본 생성자
	    // 필드 초기화
	    stu2.name = "임꺽정";
	    stu2.grade = 3;
	    stu2.department = "파이썬";

	    
	    //오버로딩 된 생성자 있을경우
//	    Student stu1 = new Student(); // 1번 생성자
//	    Student stu2 = new Student("홍길동"); // 2번 생성자
//	    Student stu3 = new Student("홍길동", 4); // 3번 생성자
//	    Student stu4 = new Student("홍길동", 4, "소프트웨어공학");

	}

}
