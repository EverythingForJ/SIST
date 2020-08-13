import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 1. java.util.Date class
 * 2. java.util.Calendar class
 * 3. java.util.Calendar & java.util.GregorianCalendar class
 * 4. java.text.DateFormat & java.util.Date class
 * 5. java.text.SimpleDateFormat & java.util.Date class
 * 6. printf(String.format()) // java.util.Formatter class
*/

public class TodayDemo {
	public static void main(String[] args) {
		// 4.
		// DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.KOREA);
		// System.out.println(df.format(new Date()));
		
		// 5.
//		String pattern = "지금은 GG yyyy년 MM월 dd일 aa hh시 mm분 ss초입니다.";
//		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
//		System.out.println(sdf.format(new Date()));
		
		// 6.
		// System.out.printf("Today is %1$tY년 %1$tm월 %1$td일.", new Date());
		String now = String.format("Today is %1$tY년 %1$tm월 %1$td일.", new Date());
		System.out.println(now);
	}
}
