
package java200.middle;

public class _41_JCalendar {
	// 윤년 판별 
	public boolean isLeapYear(int year) {
		boolean isS = false;
		if ( ((year%4 == 0) && (year%100 != 0)) 
				|| (year%400 == 0) ) {
			isS = true;
		}
		
		return isS;
	}

	public static void main(String[] args) {
		_41_JCalendar hc = new _41_JCalendar();
		System.out.println(hc.isLeapYear(2018));

	}

}

