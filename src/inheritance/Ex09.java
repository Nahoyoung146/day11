package inheritance;

class A09 {
	public void a() {
		System.out.println("aaaa");
	}
}

class B09 extends A09 {
	public void b() {
		System.out.println("bbbb");
	}
}

class C09 extends B09 {
	public void c() {
		System.out.println("cccc");
	}
}

public class Ex09 {
	public static void main(String[] args) {
		C09 c = new C09();
		c.c();
		c.a();
		c.b();
	}
}