package inheritance;

import java.util.ArrayList;

class Test02 extends ArrayList<String> {
	int a;

	public void test() {
		System.out.println("새로운 기능 추가");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Test02 t = new Test02();
		t.add("aaa");
		t.add("bbb");
		System.out.println(t.get(0));
		System.out.println(t.get(1));
		t.test();
	}
}