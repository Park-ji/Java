package HW;

public class studentExample {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "ȫ�浿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("�̸�:"+s.name);
		System.out.println("����:"+s.getTotal());
		System.out.println("���:"+s.getAverage());
	}

}

class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;	
	int math;
	
	int getTotal() {
		int sum = this.kor+this.eng+this.math;
		return sum;
	}
	
	float getAverage() {
		float avg = Math.round(getTotal()/3.0f*10)/10f;
		return avg;
	}
}
