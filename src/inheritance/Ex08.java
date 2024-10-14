package inheritance;

class A08 {
	public int num;
	String msg = "부모 msg";
	private String pri = "private 부모";
	protected String pro = "protected 부모"; // 다른 패키지라도 상속 받았으면 사용가능, 외부에서 접근불가능은 private와 같음

	public A08() {
		num = 12345;
	}
}

class B08 extends A08 {
	int num = 7777;

	public void test() {
		int num = 1111;
		System.out.println("num : " + num);
		System.out.println("this.num : " + this.num);
		System.out.println("super.num : " + super.num);
		System.out.println("--- 접근 제한자 ---");
		System.out.println("default msg : " + msg);
		// System.out.println("private pri : " + pri);
		System.out.println("protected pro : " + pro);
	}
}

public class Ex08 {
	public static void main(String[] args) {
		B08 b = new B08();
		b.test();

	}
}