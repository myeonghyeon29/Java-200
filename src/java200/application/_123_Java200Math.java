package java200.application;

/*
 *  for문으로 약수와 소인수 분해하기
 * 
 */

public class _123_Java200Math {
	// 약수 구하기
	public static void printDivide(int n) {
		System.out.print("[ ");
		for (int i=1; i<=n; i++) {
			if (n % i == 0 && n != i)
				System.out.print(i + ", ");
			if (i == n)
				System.out.print(i);
		}
		System.out.println(" ]");
	}
	
	// 소인수 분해
	public static void printPrimeDivide(int n) {
		int i = 2;
		while (n != 0) {
			if (n % i == 0) {
				n /= i;
				if (n == 1) {
					System.out.print(i);
					break;
				}
				System.out.print(i + "x");
			} else {
				i++;
			}
		}
	}

	public static void main(String[] args) {
		printDivide(120);
		printPrimeDivide(120);
	}

}
