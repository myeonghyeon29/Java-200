<<<<<<< HEAD
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
=======
package java200.elementary;

// Scanner 클래스를 import
import java.util.Scanner;

public class InOutMethod {

	public static void main(String[] args) {
		// Scanner 객체를 통해 입력을 받는다
		Scanner scann = new Scanner(System.in);
		
		// int는 nextInt()
		System.out.print("정수 입력: ");
		int choice = scann.nextInt();
		System.out.println(choice);
		
		// double은 nextDouble()
		System.out.print("실수 입력: ");
		double rchoice = scann.nextDouble();
		System.out.println(rchoice);
		
		// String은 next(), nextLine()을 
		System.out.print("문자열 입력: ");
		String schoice = scann.next();
		System.out.println(schoice);

	}

}
>>>>>>> refs/remotes/origin/master
