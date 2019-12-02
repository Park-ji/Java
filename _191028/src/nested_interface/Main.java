package nested_interface;

public class Main {
	//익명객체 만들기 - 버튼 만들기 : 익명객체(한번쓰고 버리는 객체~)
	//익명객체(Anonymous Object) : 초기값으로 사용하기 좋음~
	//익명객체는 abstract
	public static void main(String[] args) {
		//Button button = new Button();
//		Button.OnClickListener onclick = new Button.OnClickListener() { //OnClickListner가 interface이므로 객체를 만들수 업는 것이 맞지만, 한번만 사용할 용도로 만드는 객체는 가능!(익명 객체)
//
//			@Override
//			public void onClick() {
//				// TODO Auto-generated method stub
//				System.out.println("버튼 누르기");
//			}
//		};
//		
//		onclick.onClick();
//		
//	}
	
	//1번 방법
	Button btn = new Button();
	btn.setOnClickListener(new CallListener());
	btn.touch();
	
	//2번 방법
	Button.OnClickListener btn2 = new Button.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("버튼 누리기");
		}
	};
	btn2.onClick();
	
	}
}
