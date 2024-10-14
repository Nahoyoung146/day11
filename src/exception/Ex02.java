package exception;

public class Ex02 {
	public static void main(String[] args) {
		String msg = null, str = "test";
		int i = 10, x = 2;
		try {
			System.out.println(i / x);
			if (msg.equals(str)) {
				System.out.println("같다");
			}
		} catch (NullPointerException e) {
//			System.out.println("null값은 기능을 사용할 수 없음");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음!!!");
		}
		System.out.println("다음 문장들 실행!!!");
	}
}