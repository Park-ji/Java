package HW_12����;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DatePrintExample {
	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� HH�� mm��");
		System.out.println(sdf.format(now));
	}

}
