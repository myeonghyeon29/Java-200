package java200.application;

/*
 * 이중 for 문으로 역 삼각형 만들기
 */

public class _121_StarPoint {
	public static void printStar(int n) {
		char star = '*';			// * 표시
		char space = ' ';			// 공백 표시
		int max = 2 * n - 1;		// 최대 * 의 개수 
		
		// n번(줄) 반복한다
		for (int i=0; i<n; i++) {
			// 공백을 n번 줄 만큼 출력한다
			for (int j=0; j<i; j++) {
				System.out.print(space);
			}
			
			// max 만큼 별을 출력한다
			for (int j = 0; j < max; j++) {
				System.out.print(star);
			}
			
			// 최대  *의 개수를 줄여준다
			max -= 2;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printStar(8);  
	}

}
