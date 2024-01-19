package asdassd;
import java.util.Scanner;
public class Ex11 {
	public static void test3() {
		Scanner sc = new Scanner(System.in);
		int sum4 =0;
		int answer =0;
		System.out.println("Q10.할 일이 쌓였을 때");
		System.out.println("Yes: 손에 집히는 대로 시작한다. ");
		System.out.println("No: 우선 계획을 세운다. ");
		answer = sc.nextInt();
		sum4 += answer;
		System.out.println("Q11.둘 중 더 나은 상황은?");
		System.out.println("Yes: 아무 일정이 없을 때 ");
		System.out.println("No:  모든 일정이 정해져 있을 때");
		answer = sc.nextInt();
		sum4 += answer;
		System.out.println("Q12.팀플에서 내가 맡고 싶은 일은?");
		System.out.println("Yes: 정리하고 기록하는 일");
		System.out.println("No: 아이디어를 내는 일");
		answer = sc.nextInt();
		sum4 += answer;
	}
}



