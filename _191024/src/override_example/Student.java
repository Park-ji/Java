package override_example;

public class Student extends Human {
	String studentNo;
	Student(String name, String studentNo){
		//��Ӱ����϶�, �θ�ü �����ڰ� ���� ȣ��Ǿ����
		//��, super()�� �׻� �ֻ�ܿ� �־����=>��ġ�� ���� �߿�!
		super(name); // �θ�ü �����ڿ� �Ű��������� �Ѱ���
		
		System.out.println("Student(name,studentNo)");	
		this.studentNo = studentNo;		
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("hong","1234");
		System.out.println(s1.name+"\t"+s1.studentNo);
	}

}
