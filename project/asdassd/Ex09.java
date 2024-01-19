package asdassd;
import java.util.Scanner;
public class Ex09 {
	public static void test1() {
		Scanner sc = new Scanner(System.in);
		
		int sum2 = 0;
		int answer =0;
		System.out.println("Q4.선생님이 모르는 걸 알려주실 때 나는");
		System.out.println("Yes: 그러려니 하고 외운다.");
		System.out.println("No: 외우기 전에 원리를 이해하고 싶다. ");
		answer = sc.nextInt();
		sum2 += answer;
		System.out.println("Q5.보조 선생님 학원에서 우리 반 감시하라고 보낸 스파이 아니에요?");
		System.out.println("Yes: 뭐 그런 생각까지 해?");
		System.out.println("No: 마음속으로 스파이가 된 자신을 상상해 본다.");
		answer = sc.nextInt();
		sum2 += answer;
		System.out.println("Q6.지금부터 아무것도 생각하지 마!");
		System.out.println("Yes: (생각 안 함)");
		System.out.println("No: 생각을 안 하는 게 뭐지? 생각을 안 한다고 생각하는 건 생각을 하는 건가? " + "생각을 하지 않는 건가? 아무 생각도 안 하는 게 가능해? ");
		answer = sc.nextInt();
		sum2 += answer;
		
	}
	
}

