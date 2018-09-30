package java200.application;

/*
 * for 문을 이용해 개미 수열 만들기
 * Object.valueOf()는 Object형으로 형 변환
 */

public class _125_AntQuiz {
	public static void printAnt(int n) {
		char num, numNext;			// num은 기준 토큰, numNext로 다음 토큰을 찾는다 
		int count, length;			// count는 기준 토큰의 수, length는 수열의 길이
		String first = "1";			// 첫번째 수열
		String result = "";			// 결과를 저장할 수열
		
		System.out.println(first);	// 첫번째 수열 1 출력
		
		for (int i=0; i<n; i++) {	
			result = "";			// 바뀐 수열의 결과를 저장
			count = 1;				// 수열이 바뀔때 
			length = first.length();// 바뀐 수열의 길이
			
			for (int j=0; j<length;) {	// 수열의 길이 만큼 반복
				count = 1;				// 각 토큰의 수
				num = first.charAt(j);  // 기준 토큰
				int k = j + 1;          // 다음 토큰을 k로 찾는다
				
				if (k == length) {		// k번째 문자가 수열의 끝일 경우
					result += String.valueOf(num) + String.valueOf(count); // result에 수열 저장
					break;
				}
				
				numNext = first.charAt(k);  // numNext를 통해 다음 토큰을 찾는다
				while (num == numNext) {	// 같은 숫자를 count한다
					k++;   		// 다음 번째 문자로 간다
					count++;  	// 현재 토큰의 수를 추가
					if (k == length) {	// 다음 문자가 null, 수열의 끝인 경우
						break;
					}
					numNext = first.charAt(k);	// 다음 문자 저장
				}
				j = k; //j의 다음 토큰의 인덱스를 저장
				
				result += String.valueOf(num) + String.valueOf(count); // result에 수열 저장, String.valueOf는 String으로 형 변환
			}
			System.out.println(result);	// 결과 출력
			first = result;  			// 현재 수열을 기준으로 다음 개미 수열을 만든다 
			
		}
	}

	public static void main(String[] args) {
		printAnt(10);
	}
}
