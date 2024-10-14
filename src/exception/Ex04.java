package exception;

class A {

}

class B extends A {

}

class C extends A {

}

public class Ex04 {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();

		A a;
		a = new A();
		a = new B();
		a = new C();
	}
}