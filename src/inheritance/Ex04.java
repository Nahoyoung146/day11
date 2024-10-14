package inheritance;

class A04 {
	public void aaa() {
		System.out.println("AAAAAAA04 aaa 실행");
	}
}

class B04 extends A04 {
	public void test() {
		System.out.println("test 실행");
		super.aaa();
		this.aaa(); // == aaa();
	}

	public void aaa() {
		System.out.println("B04 aaa 실행");
	}
}

public class Ex04 {
	public static void main(String[] args) {
		B04 b = new B04();
		b.test();
	}
}