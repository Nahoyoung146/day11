package inheritance;

class A06 {

	private String msg;

	public A06() {
		System.out.println("받지 않는 부모 A06");
	}

	public A06(String s) {
		msg = s;
		System.out.println(msg + " : 부모 초기화");
	}

}

class B06 extends A06 {
	public B06() {
		super("전달 ~");
		System.out.println("자식 실행~~~");
	}
}

public class Ex06 {
	public static void main(String[] args) {
		B06 b = new B06();

	}
}