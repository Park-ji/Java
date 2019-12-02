package nested_interface;

public class messageListener implements Button.OnClickListener {//Button을 눌렀을때 발생하는 messageListenr는 CallListner와는 다르기 때문에 각각 만들어줌
	@Override
	public void onClick() {
		System.out.println("메세지보내기");
	}

}
