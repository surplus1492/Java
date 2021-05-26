package sub6;

import java.util.Calendar;

/*
 * 2021/05/26
 * 김영현
 * Calendar 클래스 실습
 */

public class CalendarTest {
	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		
		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH);
		int date=cal.get(Calendar.DATE);
		
		int hour=cal.get(Calendar.HOUR);
		int min=cal.get(Calendar.MINUTE);
		int sec=cal.get(Calendar.SECOND);
		
		System.out.printf("%d-%d-%d\n", year,month,date);
		System.out.printf("%d:%d:%d\n", hour,min,sec);
	}
}
