package final_class;

public class TVProgram {
	private String director;
	
	//final을 자주 사용하는 사람? 소프트웨어를 잘 사용하는 사람~
	public void setDirector(final String director) { //이렇게 매개변수에 넣으면 외부에서 받아온 값을 바꿀수는 없음(아래와 같이)
		//director = "kim"; //외부에서 받는 값을 바꿀수 없음
		this.director = director;
	}

}
