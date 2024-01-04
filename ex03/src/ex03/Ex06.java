package ex03;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		int count = 0;
		int[] arr = new int[a];

		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}
		int b ; 
		b = sc.nextInt();

		for (int j = 0; j < arr.length; j++) {
			if (b == arr[j]) {
				count++;
			}

		}
		System.out.println(count);

	}

}
