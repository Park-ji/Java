package _191022;

//import _191021._191021.*;


public class Train {
	//�ʵ�
	//�ʵ尪���� �پ��� Ÿ�԰��� ����Ҽ� ����(Ŭ������ ����~)
	String name = "KTX"; //Ŭ������ ����� ����� ��
	byte by;
	char ch;
	short sh;
	int in;
	long lo;
	float fl;
	double dou;
	boolean bool;
	int[] arr;
	//Car car = new Car();
	
	
	//������
	//- �����ڴ� ����� ����
	//- �ڵ忡�� ���� ��? ���������� ���� �˼� �ְ�
	Train(){
		//new�� ���� ��üȭ�Ҷ� ���ϸ��� ����� ==> �ʱ�ȭ �ϴ� �뵵�� ���� ���!
		System.out.println("Train()");
		name = "ITX������";
		//�ʵ尪���� "KTX"��� ���������� �����ڰ� ȣ��Ǹ鼭 "ITX������"�̶�� �ʱ�ȭ��~
	}
	Train(String s){
		name = s;
		System.out.println("input���� �ִ� �����ڰ� ����Ǿ����ϴ�.");
	}
	
	
	//�ż���
	String run() {
		return "������ �޸��ϴ�.";
	}

}
