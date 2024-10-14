package exception;

class Test06 {
	public void test1() throws InterruptedException {
		System.out.println(11111);
		test2();
	}

	public void test2() throws InterruptedException {
		System.out.println(22222);
		Thread.sleep(0);
	}
}

public class Ex06 {
	public static void main(String[] args) throws InterruptedException {
		Test06 t = new Test06();
		t.test1();
	}
}