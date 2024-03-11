package asdassd;
import java.util.Scanner;
public class Ex08 {

		
		public static void test() {
			Scanner sc = new Scanner(System.in);
			int sum1 = 0;
			int sum2 = 0;
			int sum3 = 0;
			int sum4 = 0;
			System.out.println("Q1. 나는 사실  ");
			System.out.println("yes.백엔드보다 프론트엔드가 좋다. ");
			System.out.println("no.백엔드가 잘 맞는다. ");
			int answer = sc.nextInt();
			sum1 += answer;
			System.out.println("Q2. 나는 사실 ");
			System.out.println("yes.조원보다 조장이 되고 싶었다. ");
			System.out.println("no. 조원으로 만족한다.");
			answer = sc.nextInt();
			sum1 += answer;
			System.out.println("Q3.나는 관종이다.");
			System.out.println("Yes: 그렇다.");
			System.out.println("No: 아니다. ");
			answer = sc.nextInt();
			sum1 += answer;
			// Yes 2개 이상 -> E 출력
		}
		
	}


