package P447_Q7;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {
		// TODO Auto-generated constructor stub
		
	}
	public WrongPasswordException(String message) {
		super(message);
		//System.out.println("패스워드가 존재하지 않습니다.");
	}

}
