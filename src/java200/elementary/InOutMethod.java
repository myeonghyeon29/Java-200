package java200.elementary;

import java.util.Scanner;

public class InOutMethod {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int choice = scann.nextInt();
		System.out.println(choice);
		
		System.out.print("�Ǽ� �Է�: ");
		double rchoice = scann.nextDouble();
		System.out.println(rchoice);
		
		System.out.print("���ڿ� �Է�: ");
		String schoice = scann.next();
		System.out.println(schoice);

	}

}
