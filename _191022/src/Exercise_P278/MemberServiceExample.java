package Exercise_P278;

public class MemberServiceExample {
	public static void main(String[] args) {
		
		Member mem1 = new Member("hong","12345");		
		MemberService memberservice = new MemberService();

		boolean result = memberservice.login(mem1.id,mem1.password);
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberservice.logout("hong");
		}
		else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}

}
