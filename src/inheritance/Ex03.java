package inheritance;

class Test03 {
	public void display() {
		System.out.println("나는 계산기야 ~");
	}
}

class Computer03 extends Test03 {
	public void print() {
		Test03 t = new Test03();
		System.out.println("나는 컴퓨터야 ~");
		t.display();
	}

	public void print02() {
		System.out.println("상속 컴");
		display();
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Computer03 com = new Computer03();
		com.print();
		com.print02();
	}
}