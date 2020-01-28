package collection;

import java.util.ArrayList;


class Employee /*extends Object*/{
	public Employee(int id, String name, double salary) {
		//super(); //�Ƚᵵ ��
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	int id;
	String name;
	double salary;
	
	//toString ��ӱ״��(�������̵��� ������� �ʾҴٸ�)
	//��Ű����.Ŭ������@16������ü�޸��ּ�
	//toString �������̵� ==> source �� -> Override/implement Methods����
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+"-"+name+"-"+salary;
		//return name;
	}
	
	
	
	
}
public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(5);
		//5�� ���� ���� ����/ 5���� �ڵ� ����
		list.add(10);
		list.add(3.14);
		list.add(true);
		list.add("list");
		
		Employee e1 = new Employee(100, "ȫ���", 5600.99);
		Employee e2 = new Employee(200, "�ڴ븮", 66000.99);
		Employee e3 = new Employee(300, "�����", 76000.99);
		list.add(e1);
		list.add(e2);
		list.add(e3); //��ü�� ���� ����
		list.set(0, 100); // add: �����Ͱ��� �þ 
		//set : 0�� �ε������� 100���� �����ض�
		list.remove(1); //3.14�� ���� -> 1�� index�� ����
		System.out.println("�����Ͱ��� = "+ list.size());
		
		
		for(int i=0;i<list.size();i++) {
			//System.out.println(list.get(i)); //.toString()���� ȣ�����
			//Employee ��ü�� �����ϰ� �ִ� id,name, salary�� "id-name-salary"���·� ����ϰ� ������? toString�� �������̵�
			
			
			//list ��ȸ �����Ͱ� Employee ��ü���
			// Employee�� name �������� ����ϱ� -> �������̵� ����!
			Object o = list.get(i);//list��ȸ�� ����� Object Ÿ��
			if(o instanceof Employee) {
				//ex) o instanceof String : String Ÿ���̴�? / o instanceof Integer : intŸ���̴�?
				//o��ȸ�����Ͱ� Employee Ÿ������ Ȯ��
				System.out.println(((Employee) o).name);
				//�׳� o.name�̶�� �ϸ� �ȵ� (���� : o�� ObjectŸ���̹Ƿ�~)
			}
				
		
		}
		
		//Employee��ü�� �����ϴ� list ����
		ArrayList<Employee> list2 = new ArrayList<Employee>();
		list2.add(e1);
		list2.add(e2);
		list2.add(e3);
		
		list2.set(0, new Employee(1,"�ڻ��",1000.99));//��� ������ ����
		//list2.remove(2);
		System.out.println("==============================");
		System.out.println("�����Ͱ��� : "+list2.size());
		for(int i=0;i<list2.size();i++) {
			//System.out.println(list2.get(i)); //.toString()���� ȣ�����
			//Employee ��ü�� �����ϰ� �ִ� id,name, salary�� "id-name-salary"���·� ����ϰ� ������? toString�� �������̵�
			
			//list2 ��ȸ �����Ͱ� Employee��� name ������ ���
			//list1���� �ڵ尡 ����� �ܼ�
			//����? list2.get�޼��尡 ��ȯ�ϴ� Ÿ���� Employee�̹Ƿ� ���� ����ȯ �����൵ �Ǳ⶧����
			System.out.println(list2.get(i).name);
			Employee o = list2.get(i);
			System.out.println(o.name);
		}
		
		
		
	}
	
	
	

}
