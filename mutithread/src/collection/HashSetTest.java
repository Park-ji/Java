package collection;

import java.util.HashSet;

class Student{
	public Student(int id, String name, double score) {
		//super();
		this.id = id;
		this.name = name;
		this.score = score;
	}
	int id;
	String name;
	double score;
	
	@Override
	//���� �⺻�� : ��Ű����.Ŭ������@16����
	public String toString() { //��ü����ϴ� ���忡�� "�ڵ�"ȣ������� ȭ�� ���
		return id +":"+name+":"+score;
	}
	
	
}

public class HashSetTest {
	public static void main(String[] args) {
		HashSet set = new HashSet(); //�ʱ� ���� : 10
		set.add(10);
		set.add(3.14);
		set.add("hashset");
		Student s1 = new Student(100, "���л�", 4.5);
		set.add(s1);
		//set.add(10); //�ߺ� ������ ���� x
		//list������ set�Լ��� ���� ������������
		//set���� list�� set�Լ����� �Լ� x -> ����? set�� ������ �������� �ʾƼ� index���� x
		System.out.println("������ ���� : "+set.size());
		
		//for(�ϳ��� ��ü : �÷��ǰ�ü){ }
		for(Object o : set) {//��, set���� ������ �ϳ��� ��ü�� Object ������ o�� �ްڴ�
			//set�� Ÿ���� ������ ���� �ʱ� ������ ObjectŸ������~
			System.out.println(o);
		}
			
	}

}

























