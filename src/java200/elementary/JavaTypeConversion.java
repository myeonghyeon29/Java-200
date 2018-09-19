package java200.elementary;

public class JavaTypeConversion {

	public static void main(String[] args) {
		String slat = "   37.52127220511242   ";
		//String slat = "hello";
		
		// trim()은 공백을 제거한다, parseXXX()를 통해 변환한다
		double latitude = Double.parseDouble(slat.trim());
		System.out.println(latitude);

	}

}
