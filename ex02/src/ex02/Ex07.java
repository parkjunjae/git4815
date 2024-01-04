package ex02;

import java.util.Scanner;

class AA{
	
	public void doA() {
		System.out.println("AA.doA()");
		
	}
}

public class Ex07 {
	public static void main(String[] args) {
		int a=10;
		Scanner scan = new Scanner(System.in);
		System.out.println("입력하세요 ! ");
		String inputString = scan.nextLine();
		int num = Integer.parseInt(inputString);
		System.out.println(inputString);
		AA aa = new AA();
		aa.doA();
	}

}
