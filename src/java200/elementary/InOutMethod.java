package java200.elementary;

import java.util.Scanner;

public class InOutMethod {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int choice = scann.nextInt();
		System.out.println(choice);
		
		System.out.print("실수 입력: ");
		double rchoice = scann.nextDouble();
		System.out.println(rchoice);
		
		System.out.print("문자열 입력: ");
		String schoice = scann.next();
		System.out.println(schoice);

	}

}
