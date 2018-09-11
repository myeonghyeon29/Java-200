package java200.elementary;

public class Grad {

	public static void main(String[] args) {
		int[] grade = {90, 80, 89};
		int tot = grade[0] + grade[1] + grade[2];
		int average = tot / 3;
		System.out.println("±¹¾î " + grade[0] + " ¿µ¾î " + grade[1] +
				" ¼öÇÐ " + grade[2]);
		System.out.println("ÃÑÁ¡ " + tot + " Æò±Õ " + average);

	}

}
