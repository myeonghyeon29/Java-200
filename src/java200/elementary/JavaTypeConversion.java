package java200.elementary;

public class JavaTypeConversion {

	public static void main(String[] args) {
		String slat = "   37.52127220511242   ";
		//String slat = "hello";
		
		double latitude = Double.parseDouble(slat.trim());
		System.out.println(latitude);

	}

}
