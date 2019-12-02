package P447_Q7;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white", "12345");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue","54321");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void login(String id, String password) throws Exception{
		if(!id.equals("blue")) {
			String message = "���̵� �������� �ʽ��ϴ�.";
			throw new NotExistIdException(message);
		}
		
		if(!password.equals("12345")) {
			throw new WrongPasswordException("�н����尡 �������� �ʽ��ϴ�.");
		}
	}

}
