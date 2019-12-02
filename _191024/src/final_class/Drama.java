package final_class;

//TVProgram을 final로 만들어서 상속을 막았기때문에 --> 상속이 안됨
public class Drama extends TVProgram {

	//setDirector을 final로 막았기 때문에 오버라이딩이 되지 않는다ㅎㅎ
		@Override
	public void setDirector(String director) {
		System.out.println("director setting");
		super.setDirector("kim");
	}

}
