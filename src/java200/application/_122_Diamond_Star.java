package java200.application;

/*
 * 	 이중 for문으로 다이아몬드 만들기
 * 	
 */

public class _122_Diamond_Star {
	public static void printStar(int n) {
		char star = '*';
		char space = ' ';
		int maxStar = 1;		// maxStar는 n까지 증가
		int spaceMax = n / 2;	// 최대 공백
		int mid = n / 2;		// 위 아래 삼각형을 나누는 기준
		
		for (int i=0; i<n; i++) {
			// i<mid 일 때 위 삼각형 출력
			if (i < mid) {
				// spaceMax만큼 공백 출력
				for (int j=0; j<spaceMax; j++) {
					System.out.print(space);
				}
				
				// 최대 별 만큼 * 출력
				for (int j=0; j< maxStar; j++) {
					System.out.print(star);
				}
				
				System.out.println();
				maxStar += 2;		// 최대 별의 개수를 증가시킨다
				spaceMax--;			// 최대 공백을 출력한다
			}
			else { // i>=mid 일 때 역 삼각형 출력
				// 공백을 출력한다
				for (int j=0; j<spaceMax; j++) {
					System.out.print(space);
				}
							
				// max 만큼 별을 출력한다
				for (int j = 0; j < maxStar; j++) {
					System.out.print(star);
				}
							
				// 최대  *의 개수를 줄여준다
				maxStar -= 2;
				spaceMax++;
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		printStar(13);
	}
}
