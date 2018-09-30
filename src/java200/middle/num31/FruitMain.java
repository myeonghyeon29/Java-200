package java200.middle.num31;

public class FruitMain {

	public static void main(String[] args) {
		// enum 사용 시 상수처럼 접근해서 사용한다
		FRUIT pear = FRUIT.APPLE;
		FRUIT pear2 = FRUIT.MANGO;
		
		System.out.println(pear);				// 연결된 enum 상수의 이름 출력
		System.out.println(pear.name());		// name(): 연결된 enum 상수의 이름 출력
		System.out.println(pear.ordinal());		// ordinal(): APPLE의 순서 출력
		System.out.println(pear2.ordinal());	// MANGO의 순서 출력
		
		FRUIT[] fruits = FRUIT.values();		// values(): 배열로 만들어 리턴
		System.out.println(fruits[1]);

	}

}
