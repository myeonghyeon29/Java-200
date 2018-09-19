package java200.elementary;

class JLocation {
	public double lat;
	public double lng;
}

public class JavaUserDefinedTypes {

	public static void main(String[] args) {
		double latitude = 37.5212352341;
		double longitude = 127.0074472890625;
		
		// 사용자 정의 클래스 사용
		JLocation jloc = new JLocation();
		jloc.lat = latitude;
		jloc.lng = longitude;
		
		JLocation newLoc = jloc;
		newLoc.lat = 18.3215;
		System.out.println(newLoc.lat);
		System.out.println(jloc.lat);

	}

}
