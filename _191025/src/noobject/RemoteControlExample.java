package noobject;

//익명 객체 : 클래스를 정의하지 않고 객체를 정의하는 방법 ==> 재사용이 불가능한 클래스(객체를 1번 만드는 용도!)

public class RemoteControlExample {
	public static void main(String[] args) {
		//익명객체인 경우? 딱 한번만 객체를 만듦
		RemoteControl remote = new RemoteControl(){
			//원래 인터페이스는 생성자가 불가능한데 익명으로 강제로 객체 만들어줌
			//익명객체는 클래스가 아님
			public void setVolume(int volume) {
				System.out.println("볼륨 : " + volume);
			}		
		}; //여기서 ';'안하면 안됨 ==> 이유 : 그냥 객체를 정의한 실행문취급을 받음
		
		remote.setVolume(100);
		
	}

}
