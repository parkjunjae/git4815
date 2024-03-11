package asdassd;
import java.util.Scanner;
public class Ex10 {

	public static void test2() {
		Scanner sc = new Scanner(System.in);
		
		int sum3 = 0;
		int answer =0;
		System.out.println("Q7.약속 시간에 1시간이나 늦은 친구,");
		System.out.println("Yes: 사과 이전에 늦은 이유가 궁금하다.");
		System.out.println("No: 친구의 진심을 담은 사과에 마음이 풀린다. ");
		answer = sc.nextInt();
		sum3 += answer;
		System.out.println("Q8.나는 대화를 할 때");
		System.out.println("Yes: 사람보다 챗지피티와 대화하는 게 편하다.");
		System.out.println("No: 당연히 사람이 더 편하다.");
		answer = sc.nextInt();
		sum3 += answer;
		System.out.println("Q9.더 기분 좋은 칭찬은?");
		System.out.println("Yes: 너 천재임?");
		System.out.println("No: 너 천사임?");
		answer = sc.nextInt();
		sum3 += answer;
	}
}

