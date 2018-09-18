package java200.elementary;

public class BioCalendar {
	// 상수는 static final을 붙여 사용한다
	public static final int PHYSICAL = 23;

	public static void main(String[] args) {
		int index = PHYSICAL;
		int days = 1200;
		
		double vals = (days % index) * 2 * Math.PI / index;
		System.out.println(Math.toDegrees(vals) + "도");
	}

}
