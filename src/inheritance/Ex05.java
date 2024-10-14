package inheritance;

class A05 {
	public A05() {
		System.out.println("A05 부모 생성자");
	}

}

class B05 extends A05 {
	public B05() {
		System.out.println("B05 자식 생성자");
	}
}

public class Ex05 {
	public static void main(String[] args) {
		B05 b = new B05();
	}
}