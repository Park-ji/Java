package HW_12����;

public class Member {
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	private String id;
	private String name;
	@Override
	public String toString() {
		return id+":"+name;
	}
	
	
	

}
