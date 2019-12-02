package override_example;

public class Student extends Human {
	String studentNo;
	Student(String name, String studentNo){
		//상속관계일때, 부모객체 생성자가 먼저 호출되어야함
		//즉, super()는 항상 최상단에 있어야함=>위치가 아주 중요!
		super(name); // 부모객체 생성자에 매개변수값을 넘겨줌
		
		System.out.println("Student(name,studentNo)");	
		this.studentNo = studentNo;		
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("hong","1234");
		System.out.println(s1.name+"\t"+s1.studentNo);
	}

}
