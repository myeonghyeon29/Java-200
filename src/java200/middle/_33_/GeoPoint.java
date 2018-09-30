package java200.middle._33_;

public class GeoPoint {

	public static void main(String[] args) {
		double latitude1 = 37.52127220511242;
		double longitude1 = 127.0074462890625;
		double latitude2 = 35.13789119634185;
		double longitude2 = 129.04541015625;
		
		// new로 사용자 정의 클래스를 만든다
		Geo geo1 = new Geo();
		// 객체. 으로 필드에 접근한다
		geo1.latitude = latitude1;
		geo1.longitude = longitude1;
		System.out.println(geo1.latitude + "\t" + geo1.longitude);
		
		Geo geo2 = new Geo();
		geo2.latitude = latitude2; 
		geo2.longitude = longitude2;
		
		Geo geo = geo1;
		System.out.println(geo.latitude + "\t" + geo.longitude);

	}

}
