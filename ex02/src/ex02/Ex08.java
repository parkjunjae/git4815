package ex02;

import java.util.Scanner;

public class Ex08 {
	// num1 과 num2 매개변수로 받고 int형을 돌려주는 solution함수
	public static int solution(int num1, int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {
		// nextLine 문자열 입력
		// nextIn 정수 입력
		Scanner scan = new Scanner(System.in);

		System.out.println("숫자입력");

		int num1 = scan.nextInt();

		System.out.println("숫자입력");

		int num2 = scan.nextInt();
		
		int result = solution(num1, num2);
		
		System.out.println("결과 = " + result);

	}
}
