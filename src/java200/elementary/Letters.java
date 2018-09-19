package java200.elementary;

public class Letters {

	public static void main(String[] args) {
		char a = '닳';
		String letter = "동해 물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
		// 문자열의 길이 = length()
		int letterNumber = letter.length();
		// '닳'의 위치 반환, indexOf('A')
		int loc = letter.indexOf(a);
		System.out.printf("\"%s\"=> %d자이며 , %c은 %d번째 있다.\n", letter,
				letterNumber, a, loc);
		// n번째 문자 반환 charAt(n)
		char b = letter.charAt(loc);
		System.out.printf("\"%s\"의 %d번째 문자는 '%c'이다.", letter, loc, b);

	}

}
