package nested_interface;

public class CallListener implements Button.OnClickListener { //��ư �ȿ� �ִ� OnClickLister�� CallListener�� �������(interface ���)
	@Override
	public void onClick() {
		System.out.println("��ȭ�ɱ�");
	}

}
