<<<<<<< HEAD
package java200.middle;

public class JCalendar {
	
	public boolean isLeapYear(int year) {
		boolean isS = false;
		if ( ((year%4 == 0) && (year%100 != 0)) 
				|| (year%400 == 0) ) {
			isS = true;
		}
		
		return isS;
	}

	public static void main(String[] args) {
		JCalendar hc = new JCalendar();
		System.out.println(hc.isLeapYear(2018));

	}

}
=======
package java200.middle;

public class JCalendar {
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
		JCalendar hc = new JCalendar();
		System.out.println(hc.isLeapYear(2018));

	}

}
>>>>>>> refs/remotes/origin/master
