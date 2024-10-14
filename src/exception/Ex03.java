package exception;

public class Ex03 {
	public static void main(String[] args) {
		int x = 10, y = 0;
		try {
			// System.out.println(x / y);
			int[] arr = { 10, 20, 30 };
			for (int i = 0; i < 5; i++) {
				System.out.println(arr[i]);
			}
			System.out.println("다음 문장들 실행!!!");
		} catch (Exception e) {
			// System.out.println("인덱스 벗어남");
			e.printStackTrace();
		}
		System.out.println("....");
	}
}