package nested_interface;

public class messageListener implements Button.OnClickListener {//Button�� �������� �߻��ϴ� messageListenr�� CallListner�ʹ� �ٸ��� ������ ���� �������
	@Override
	public void onClick() {
		System.out.println("�޼���������");
	}

}
