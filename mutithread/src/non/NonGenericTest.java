package non;

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
class Box{
	Object contents;
//	Box b = new Box(new Apple()); //�������
//	Box b = new Box(new Paper()); //���̻���
//	�̷��� �ϱ� ���ؼ� Object�� ��� -> Object�� java�� ��� Ÿ���� �����ϴϱ�~	
	Box (Object contents){this.contents = contents;}
	public Object getContents() {return contents;}
	public void setContents(Object contents) {this.contents = contents;}	
}

public class NonGenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Box<Apple> list = new Box<Apple>(); //�������
//		Box<Paper> list1 = new Box<Paper>(); //���̻���
		
		Apple a = new Apple();
		a.setOrigin("���");
		
		Box aBox = new Box(a); //����� �������� ����ڽ��� �ϳ� ����
		Object o = aBox.getContents();
		System.out.println(((Apple)o).getOrigin()); //������ Ȯ��
		
		//cf) a�� Paper Ÿ���ϼ��� �����ϱ� -> o instanceof Apple�� ���� ����
		//but, �Ź� �ϱ� ����� ==> Paper,Apple�� ȣȯ�ϰ� ����=> GenericTest.java!
		
		
	}

}



















