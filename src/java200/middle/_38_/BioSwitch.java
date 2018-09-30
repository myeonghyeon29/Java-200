package java200.middle._38_;

public class BioSwitch {

	public static String textInfor(PEI index, double value) {
		String result = "";
		switch (index) {
			case PHYSICAL: result = "신체 지수:"; break;
			case EMOTIONAL: result = "감정 지수:"; break;
			case INTELLECTUAL: result = "지성 지수:"; break;
			default: result = "�̰���:"; break;
		}
		
		return result + (value*100);
	}

	public static void main(String[] args) {
		PEI index = PEI.PHYSICAL;
		double value = 0.86;
		System.out.println(index.getPei());
		String st = textInfor(index, value);
		System.out.println(st);
		System.out.println(index.ordinal());
		System.out.println(index.name());
		System.out.println(index);
		System.out.println(index.getPei());

	}

}
