package java200.middle;

public class SwitchCondition {

	public static void main(String[] args) {
		char a = 'J';
		int result = toNum(a);
		System.out.printf("%c => %d\n", a, result);

	}

	private static int toNum(char a) {
		int tot = 0;
		switch(a) {
		case 'A': tot = 1; break;
		case 'T': tot = 10; break;
		case 'J': tot = 11; break;
		case 'Q': tot = 12; break;
		case 'K': tot = 13; break;
		default: tot = a - '0'; break;
		}
		return tot;
	}

}
