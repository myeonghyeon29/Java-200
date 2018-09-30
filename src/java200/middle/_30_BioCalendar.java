 package java200.middle;

public class _30_BioCalendar {

	// 상수는 final 기호를 붙혀준다
	public static final int PHYSICAL = 23;
	
	/*public static double getBioRhythm(long days, int index, int max) {
		return max * Math.sin((days % index) * 2 * Math.PI / index);
	}*/
	
	// 멤버 메소드 사용, non-static
	public double getBioRhythm(long days, int index, int max) {
		return max * Math.sin((days % index) * 2 * Math.PI / index);
	}
	
	public static void main(String[] args) {
		int days = 1200;
		// 멤버 메소드를 사용하려면 객체를 통해 호출한다
		_30_BioCalendar bio = new _30_BioCalendar();
		double phyval = bio.getBioRhythm(days, PHYSICAL, 100);
		System.out.println(phyval);

	}

}
