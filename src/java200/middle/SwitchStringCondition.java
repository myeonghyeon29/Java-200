package java200.middle;

public class SwitchStringCondition {

	public static void main(String[] args) {
		String money = "USD";
		double result = toMoney(money);
		System.out.printf("%s => %f\n", money, result);
	}

	private static double toMoney(String c) {
		double tot = 0.0;
		switch(c) {
		case "USD": tot = 1120.5; break;
		case "JPY": tot = 110.6; break;
		case "CNY": tot = 10.5; break;
		default: tot = 1; break;
		}
		return tot;
	}

}
