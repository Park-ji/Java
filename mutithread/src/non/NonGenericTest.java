package non;

class Apple{
	String origin;//원산지
	public String getOrigin() {return origin;}
	public void setOrigin(String origin) {this.origin = origin;}	
}
class Paper{
	String size;
	public String getSize() {return size;}
	public void setSize(String size) {this.size = size;}
}
class Box{
	Object contents;
//	Box b = new Box(new Apple()); //사과상자
//	Box b = new Box(new Paper()); //종이상자
//	이렇게 하기 위해서 Object로 사용 -> Object는 java의 모든 타입이 가능하니까~	
	Box (Object contents){this.contents = contents;}
	public Object getContents() {return contents;}
	public void setContents(Object contents) {this.contents = contents;}	
}

public class NonGenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Box<Apple> list = new Box<Apple>(); //사과상자
//		Box<Paper> list1 = new Box<Paper>(); //종이상자
		
		Apple a = new Apple();
		a.setOrigin("경북");
		
		Box aBox = new Box(a); //경북이 원산지인 사과박스를 하나 만듦
		Object o = aBox.getContents();
		System.out.println(((Apple)o).getOrigin()); //원산지 확인
		
		//cf) a가 Paper 타입일수도 있으니까 -> o instanceof Apple로 에러 잡음
		//but, 매번 하기 어려움 ==> Paper,Apple을 호환하고 싶음=> GenericTest.java!
		
		
	}

}



















