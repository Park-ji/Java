package nested_interface;

public class Button {
	
	OnClickListener listener;
	//용도 1 : 다형성을 사용해서 어떤 이벤트를 사용할지?
	void setOnClickListener(OnClickListener listener) { //다형성 사용(CallListner, messageListener를 자동 형변환~)
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	//용도 2: 어떤 이벤트를 만들건지?
	//중첩 인터페이스
	interface OnClickListener{
		void onClick();
	}

}
