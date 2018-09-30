
package java200.middle;

public class _42_Temperature {

	public static void main(String[] args) {
		// 0도부터 100도까지 섭씨를 화씨로 바꾼다
		for (int i=0; i<101; i++) {
			double fahrenheit = 9.0/5*i + 32;
			System.out.printf("섭씨 %d도 = 화씨 %.2f도 \n", i, fahrenheit);
		}

	}

}
