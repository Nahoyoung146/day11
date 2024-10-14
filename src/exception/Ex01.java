package exception;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, y, result = 0;
		while (true) {
			System.out.println("수 입력 : ");
			x = input.nextInt();
			y = input.nextInt();
			try {
				result = x / y;
				System.out.println("나눈 결과 : " + result);
			} catch (Exception e) {
				System.out.println("0으로는 나눌 수 없음!!");
				System.out.println("다시 입력...");
			}
		}
	}
}