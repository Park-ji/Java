package HW_12일차;

public class IntegerCompareExample {
	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1==obj2);
		System.out.println(obj3==obj4);
		//이유 : 포장 객체는 내부의 값을 비교하기 위해 ==,!=연산자는 사용할 수 x
		//왜냐, 위 연산자는 내부의 값이 아닌 포장 객체의 참조를 비교하므로
		//내부의 값을 비교하기 위해서는 언박싱한 값을 얻어 비교해야한다 
		//자바 언어 명세에 보면 ==,!=를 사용할 수 있게 자동 언박싱되는 값의 범위가 나와있다.
		//그 중, byte,short,int와 같은 경우는 -128~127사이여야하므로
		//범위를 넘는 300이라는 값은 자동 언박싱이 되지 않는다 => 따라서, 결과는 false
		System.out.println(obj3.equals(obj4));
	}

}
