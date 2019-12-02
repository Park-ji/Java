package HW_12일차;

import java.util.regex.Pattern;

public class PatternMatcherExample {
	public static void main(String[] args) {
		String id = "5Angel1004";
		String regExp = "([a-zA-Z]\\w+){8,12}"; // \\로 해야 \를 인식함(역슬래쉬표현방법)
		boolean isMatch = Pattern.matches(regExp, id);
		if(isMatch) {
			System.out.println("ID로 사용할 수 있습니다.");
		}
		else {
			System.out.println("ID로 사용할 수 없습니다.");
		}
	}

}
