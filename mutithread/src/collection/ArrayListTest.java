package collection;

import java.util.ArrayList;


class Employee /*extends Object*/{
	public Employee(int id, String name, double salary) {
		//super(); //안써도 됨
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	int id;
	String name;
	double salary;
	
	//toString 상속그대로(오버라이딩을 사용하지 않았다면)
	//패키지명.클래스명@16진수객체메모리주소
	//toString 오버라이딩 ==> source 탭 -> Override/implement Methods선택
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
		//5개 저장 공간 색성/ 5개씩 자동 증가
		list.add(10);
		list.add(3.14);
		list.add(true);
		list.add("list");
		
		Employee e1 = new Employee(100, "홍사원", 5600.99);
		Employee e2 = new Employee(200, "박대리", 66000.99);
		Employee e3 = new Employee(300, "김과장", 76000.99);
		list.add(e1);
		list.add(e2);
		list.add(e3); //객체도 저장 가능
		list.set(0, 100); // add: 데이터갯수 늘어남 
		//set : 0번 인덱스값을 100으로 변경해라
		list.remove(1); //3.14을 삭제 -> 1번 index를 삭제
		System.out.println("데이터갯수 = "+ list.size());
		
		
		for(int i=0;i<list.size();i++) {
			//System.out.println(list.get(i)); //.toString()먼저 호출실행
			//Employee 객체가 포함하고 있는 id,name, salary를 "id-name-salary"형태로 출력하고 싶을때? toString을 오버라이딩
			
			
			//list 조회 데이터가 Employee 객체라면
			// Employee의 name 변수값만 출력하기 -> 오버라이딩 없이!
			Object o = list.get(i);//list조회된 결과는 Object 타입
			if(o instanceof Employee) {
				//ex) o instanceof String : String 타입이니? / o instanceof Integer : int타입이니?
				//o조회데이터가 Employee 타입인지 확인
				System.out.println(((Employee) o).name);
				//그냥 o.name이라고 하면 안됨 (이유 : o는 Object타입이므로~)
			}
				
		
		}
		
		//Employee객체만 저장하는 list 선언
		ArrayList<Employee> list2 = new ArrayList<Employee>();
		list2.add(e1);
		list2.add(e2);
		list2.add(e3);
		
		list2.set(0, new Employee(1,"박사원",1000.99));//라는 식으로 수정
		//list2.remove(2);
		System.out.println("==============================");
		System.out.println("데이터갯수 : "+list2.size());
		for(int i=0;i<list2.size();i++) {
			//System.out.println(list2.get(i)); //.toString()먼저 호출실행
			//Employee 객체가 포함하고 있는 id,name, salary를 "id-name-salary"형태로 출력하고 싶을때? toString을 오버라이딩
			
			//list2 조회 데이터가 Employee라면 name 변수값 출력
			//list1보다 코드가 더욱더 단순
			//이유? list2.get메서드가 반환하는 타입은 Employee이므로 따로 형변환 안해줘도 되기때문에
			System.out.println(list2.get(i).name);
			Employee o = list2.get(i);
			System.out.println(o.name);
		}
		
		
		
	}
	
	
	

}
