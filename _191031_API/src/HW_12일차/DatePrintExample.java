package HW_12일차;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DatePrintExample {
	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
		System.out.println(sdf.format(now));
	}

}
