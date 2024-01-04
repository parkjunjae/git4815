package ex03;

import java.util.Scanner;

public class Ex03 {
	/*
	 * 실수는 소수 둘째자리
	 * 
	 * 숫자를 받아 소수 둘째자리까지
	 * 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자입력");
		double d = scan.nextDouble();
		System.out.println("d ="+ d);
		double trans_d = (int)(d*100)/100.00;
		System.out.println("trans_d ="+ trans_d);
		
		//next() 문자열 빈공백전까지
		//nextLine() 문자열 한줄
		//nextInt() 정수입력
		//nextDouble() 실수입력
	}

}
