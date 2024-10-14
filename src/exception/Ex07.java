package exception;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age = 0;
		System.out.print("나이 입력 : ");
		try {
			age = input.nextInt();
			if (age < 1) {
				throw new Exception("0 이하의 나이는 없음!!");
			}
			System.out.println("나이 : " + age);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}