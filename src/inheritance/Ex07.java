package inheritance;

class A07 {
	public A07() {
		System.out.println("A07 부모. 매개변수 x");
	}

	public A07(String s) {
		System.out.println(s + " : A07 부모. 매개변수 o");
	}
}

class B07 extends A07 {
	public B07() {
		super("1111");
		System.out.println("B07 자식");
	}

	public B07(String s) {
		super(s);
		System.out.println(s + " : B07 자식");
	}
}

public class Ex07 {
	public static void main(String[] args) {
		B07 b01 = new B07();
		B07 b02 = new B07("aaa");

	}
}