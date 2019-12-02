package poly;

//Han이 에러뜨는 이유?
//현재, Han()이라고만 선언되고 -> super()가 되는데
//Trie의 생성자는 매개변수가 있는데 만들어진 super()에는
//매개변수를 지정해주지 않아서 에러가 뜸~
public class Han extends Tire{
	
	Han(String location, int inch){
		super(location,"Hankook",inch,1000);
	}
}
