package java200.application;

/*
 * 	 이중 for문으로 다이아몬드 만들기
 * 	
 */

public class _122_Diamond_Star {
	public static void printStar(int n) {
		char star = '*';
		char space = ' ';
		int maxStar = n;
		int spaceMax = n / 2 + 1;
		int mid = n / 2;
		
		for (int i=0; i<n; i++) {
			if (i < mid) {
				for (int j=0; j<spaceMax; j++) {
					System.out.print(space);
				}
				
				for (int j=0; j<=i * 2; j++) {
					System.out.print(star);
				}
				
				System.out.println();
				spaceMax--;
			}
			else {
				// 공백을 출력한다
				for (int j=0; j<i- (n / 2 - 1); j++) {
					System.out.print(space);
				}
							
				// max 만큼 별을 출력한다
				for (int j = 0; j < maxStar; j++) {
					System.out.print(star);
				}
							
				// 최대  *의 개수를 줄여준다
				maxStar -= 2;
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		printStar(9);
	}
}
