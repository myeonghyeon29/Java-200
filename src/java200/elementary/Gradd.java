package java200.elementary;

public class Gradd {

	public static void main(String[] args) {
		int kor = 90;
		int eng = 80;
		int math = 89;
		int tot = kor + eng + math;
		int average = tot / 3;
		
		// Java에서 printf 사용법은 C언어의 그것과 다르지 않다.
		System.out.printf("국어 %d, 영어 %d, 수학 %d\t", kor, eng, math);
		System.out.printf("총점 %d, 평균 %d \n", tot, average);
		System.out.println("국어 " + kor);

	}

}
