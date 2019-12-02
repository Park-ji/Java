package nested_interface;

public class CallListener implements Button.OnClickListener { //버튼 안에 있는 OnClickLister를 CallListener가 만들어줌(interface 상속)
	@Override
	public void onClick() {
		System.out.println("전화걸기");
	}

}
