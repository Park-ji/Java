package nested_interface;

public class Main {
	//�͸�ü ����� - ��ư ����� : �͸�ü(�ѹ����� ������ ��ü~)
	//�͸�ü(Anonymous Object) : �ʱⰪ���� ����ϱ� ����~
	//�͸�ü�� abstract
	public static void main(String[] args) {
		//Button button = new Button();
//		Button.OnClickListener onclick = new Button.OnClickListener() { //OnClickListner�� interface�̹Ƿ� ��ü�� ����� ���� ���� ������, �ѹ��� ����� �뵵�� ����� ��ü�� ����!(�͸� ��ü)
//
//			@Override
//			public void onClick() {
//				// TODO Auto-generated method stub
//				System.out.println("��ư ������");
//			}
//		};
//		
//		onclick.onClick();
//		
//	}
	
	//1�� ���
	Button btn = new Button();
	btn.setOnClickListener(new CallListener());
	btn.touch();
	
	//2�� ���
	Button.OnClickListener btn2 = new Button.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("��ư ������");
		}
	};
	btn2.onClick();
	
	}
}
