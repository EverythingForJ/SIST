import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class TodayDemo1 {

	public static void main(String[] args) {
//		Calendar cal = new GregorianCalendar();
//		int year = cal.get(Calendar.YEAR);
//		int month = cal.get(Calendar.MONTH+1);
//		// int day = cal.get(Calendar.DATE);
//		int day = cal.get(Calendar.DAY_OF_MONTH);
//		System.out.println("오늘은"+year+"년 "+month+"월 "+day+"일입니다.");
		
//		Calendar cal = Calendar.getInstance(Locale.KOREA); // 현재 날짜 시간 
//		int year = cal.get(Calendar.YEAR);
//		int month = cal.get(Calendar.MONTH+1);
//		int day = cal.get(Calendar.DAY_OF_MONTH);
//		System.out.println("오늘은"+year+"년 "+month+"월 "+day+"일입니다.");
		
		Calendar cal = new GregorianCalendar(2020, 7, 1); // 2020년 8월 1일
		int yoil = cal.get(Calendar.DAY_OF_WEEK); // 일요일: 1,
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		System.out.println(yoil);
	}
	
}