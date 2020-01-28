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
	//원래 기본값 : 패키지명.클래스명@16진수
	public String toString() { //객체출력하는 문장에서 "자동"호출실행결과 화면 출력
		return id +":"+name+":"+score;
	}
	
	
}

public class HashSetTest {
	public static void main(String[] args) {
		HashSet set = new HashSet(); //초기 개수 : 10
		set.add(10);
		set.add(3.14);
		set.add("hashset");
		Student s1 = new Student(100, "김학생", 4.5);
		set.add(s1);
		//set.add(10); //중복 데이터 저장 x
		//list에서는 set함수로 값을 수정가능했음
		//set에는 list의 set함수같은 함수 x -> 이유? set은 순서가 유지되지 않아서 index값이 x
		System.out.println("데이터 개수 : "+set.size());
		
		//for(하나의 객체 : 컬렉션객체){ }
		for(Object o : set) {//즉, set에서 데이터 하나의 객체를 Object 형태의 o로 받겠다
			//set의 타입이 정해져 있지 않기 때문에 Object타입으로~
			System.out.println(o);
		}
			
	}

}

























