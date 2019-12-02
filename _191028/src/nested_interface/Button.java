package nested_interface;

public class Button {
	
	OnClickListener listener;
	//�뵵 1 : �������� ����ؼ� � �̺�Ʈ�� �������?
	void setOnClickListener(OnClickListener listener) { //������ ���(CallListner, messageListener�� �ڵ� ����ȯ~)
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	//�뵵 2: � �̺�Ʈ�� �������?
	//��ø �������̽�
	interface OnClickListener{
		void onClick();
	}

}
