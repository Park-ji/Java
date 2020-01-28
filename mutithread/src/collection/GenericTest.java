package collection;

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
class Box<T>{ //T : 존재하지 않는 아무이름이나 가능 -> 보통 T(Type)을 많이 씀
	//아직까지 T의 타입이 뭐가 될지 모름
	T contents;
	Box (T contents){this.contents = contents;}
	public T getContents() {return contents;}
	public void setContents(T contents) {this.contents = contents;}	
}
//cf)
// Box(T, Y){
// T contents; Y second;
//}라면 main에서도 2개를 넘겨줘야함
public class GenericTest {

	public static void main(String[] args) {		
		Apple a = new Apple();
		a.setOrigin("경북");		
		Box<Apple> aBox = new Box<Apple>(a); //경북이 원산지인 사과박스를 하나 만듦

//		Apple o = aBox.getContents();
//		System.out.println(o.getOrigin()); //원산지 확인
		System.out.println(aBox.getContents().getOrigin());
		
		Paper p = new Paper();
		p.setSize("A4");
		Box<Paper> pBox = new Box<Paper>(p);
		System.out.println(pBox.getContents().getSize());
		
	}

}



















