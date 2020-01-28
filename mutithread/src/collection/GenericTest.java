package collection;

class Apple{
	String origin;//������
	public String getOrigin() {return origin;}
	public void setOrigin(String origin) {this.origin = origin;}	
}
class Paper{
	String size;
	public String getSize() {return size;}
	public void setSize(String size) {this.size = size;}
}
class Box<T>{ //T : �������� �ʴ� �ƹ��̸��̳� ���� -> ���� T(Type)�� ���� ��
	//�������� T�� Ÿ���� ���� ���� ��
	T contents;
	Box (T contents){this.contents = contents;}
	public T getContents() {return contents;}
	public void setContents(T contents) {this.contents = contents;}	
}
//cf)
// Box(T, Y){
// T contents; Y second;
//}��� main������ 2���� �Ѱ������
public class GenericTest {

	public static void main(String[] args) {		
		Apple a = new Apple();
		a.setOrigin("���");		
		Box<Apple> aBox = new Box<Apple>(a); //����� �������� ����ڽ��� �ϳ� ����

//		Apple o = aBox.getContents();
//		System.out.println(o.getOrigin()); //������ Ȯ��
		System.out.println(aBox.getContents().getOrigin());
		
		Paper p = new Paper();
		p.setSize("A4");
		Box<Paper> pBox = new Box<Paper>(p);
		System.out.println(pBox.getContents().getSize());
		
	}

}



















