<<<<<<< HEAD
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
=======
package java200.elementary;

// Scanner �겢�옒�뒪瑜� import
import java.util.Scanner;

public class InOutMethod {

	public static void main(String[] args) {
		// Scanner 媛앹껜瑜� �넻�빐 �엯�젰�쓣 諛쏅뒗�떎
		Scanner scann = new Scanner(System.in);
		
		// int�뒗 nextInt()
		System.out.print("�젙�닔 �엯�젰: ");
		int choice = scann.nextInt();
		System.out.println(choice);
		
		// double��� nextDouble()
		System.out.print("�떎�닔 �엯�젰: ");
		double rchoice = scann.nextDouble();
		System.out.println(rchoice);
		
		// String��� next(), nextLine()�쓣 
		System.out.print("臾몄옄�뿴 �엯�젰: ");
		String schoice = scann.next();
		System.out.println(schoice);

	}

}
>>>>>>> refs/remotes/origin/master
