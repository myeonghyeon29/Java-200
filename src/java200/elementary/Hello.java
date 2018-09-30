
package java200.elementary;

public class Hello {
	
	// static을 쓰면 객체 생성 없이 사용 가능
	public static void showHello() {
		System.out.println("*****************************");
		System.out.println("*  ÀÌ ÇÁ·Î±×·¥Àº Java200ÀÌ ¸¸µë          *");
		System.out.println("*****************************");
	}

	public static void main(String[] args) {
		// Hello 객체를 생성하지 않아도 메소드에 접근 가능
		showHello();
	}

}
