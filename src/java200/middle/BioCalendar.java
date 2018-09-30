 package java200.middle;

public class BioCalendar {

	public static final int PHYSICAL = 23;
	
	/*public static double getBioRhythm(long days, int index, int max) {
		return max * Math.sin((days % index) * 2 * Math.PI / index);
	}*/
	
	public double getBioRhythm(long days, int index, int max) {
		return max * Math.sin((days % index) * 2 * Math.PI / index);
	}
	
	public static void main(String[] args) {
		int days = 1200;
		BioCalendar bio = new BioCalendar();
		double phyval = bio.getBioRhythm(days, PHYSICAL, 100);
		System.out.println(phyval);

	}

}
