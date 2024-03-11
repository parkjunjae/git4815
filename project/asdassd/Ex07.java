package asdassd;
import java.util.Scanner;
public class Ex07 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("이름을 입력하세요");
			String a = sc.nextLine();
			System.out.println("이름은 =" + a);
			System.out.println("성별을 입력하세요");
			String b = sc.nextLine();
			System.out.println("성별은 =" + b);
			int sum1 = 0;
			int sum2 = 0;
			int sum3 = 0;
			int sum4 = 0;
			System.out.println("문제를 드리겠습니다.");
			System.out.println("YES면 0을 NO면 1을 입력하세요.");

			Ex08.test();
		
			System.out.println("-----------------------");

			Ex09.test1();
			

			System.out.println("-----------------------");

			Ex10.test2();
			
			System.out.println("-----------------------");
		
			Ex11.test3();
			
			System.out.println("-----------------------");
			//---------------------------------------------------
			
			if (sum1 < 2 && sum2 < 2 && sum3 < 2 && sum4 < 2) {
				// System.out.println("ESTP인 당신");
				System.out.println("어울리는 캐릭터는 쿠로미이있다.");
			} else if (sum1 < 2 && sum2 < 2 && sum3 < 2) {
				// System.out.println("ESTJ");
				System.out.println("어울리는 캐릭터는 헤르미온느 등이 있다.");
			} else if (sum1 < 2 && sum2 < 2 && sum4 < 2) {
				// System.out.println("ESFP");
				System.out.println("어울리는 캐릭터는 루피/토니스타크  가 있다.");
			} else if (sum1 < 2 && sum2 < 2) {
				// System.out.println("ESFJ");
				System.out.println("어울리는 캐릭터는 도라에몽/마더 테레사 이순신 도라에몽 가 있다.");
			} else if (sum1 < 2 && sum3 < 2 && sum4 < 2) {
				// System.out.println("ENTP");
				System.out.println("어울리는 캐릭터는 짱구/코난 가 있다.");
			} else if (sum1 < 2 && sum3 < 2) {
				// System.out.println("ENTJ");
				System.out.println("어울리는 캐릭터는 제임스 고슬링 가 있다.");
			} else if (sum1 < 2 && sum4 < 2) {
				// System.out.println("ENFP");
				System.out.println("어울리는 캐릭터는 뽀로로,둘리,스펀지밥,케로로 가 있다.");
			} else if (sum1 < 2) {
				// System.out.println("ENFJ");
				System.out.println("어울리는 캐릭터는 피카츄,윤석열 가 있다.");
			} else if (sum2 < 2 && sum3 < 2 && sum4 < 2) {
				// System.out.println("ISTP");
				System.out.println("어울리는 캐릭터는 리바이 뮬란 등이 있다.");
			} else if (sum2 < 2 && sum3 < 2) {
				// System.out.println("ISTJ");
				System.out.println("어울리는 캐릭터는 징징이, 이병헌 강호동 가 있다.");
			} else if (sum2 < 2 && sum4 < 2) {
				// System.out.println("ISFP");
				System.out.println("어울리는 캐릭터는 해리포터, 강현욱 님 가 있다.");
			} else if (sum2 < 2) {
				// System.out.println("ISFJ");
				System.out.println("어울리는 캐릭터는 박명회 선생님, 캡틴 아메리카, 김태희 송혜교 가 있다.");
			} else if (sum3 < 2 && sum4 < 2) {
				// System.out.println("INTP");
				System.out.println("어울리는 캐릭터는 권수민, 로드 존슨(스프링 창시자), 하이버네이트 창시자, 윤동주 김구 가 있다.");
			} else if (sum3 < 2) {
				// System.out.println("INTJ");
				System.out.println("어울리는 캐릭터는 타노스, 박지성 최민식 가 있다.");
			} else if (sum4 < 2) {
				// System.out.println("INFP");
				System.out.println("어울리는 캐릭터는 마이 멜로디, 아이유 정유미 가 있다.");
			} else {
				// System.out.println("INFJ");
				System.out.println("어울리는 캐릭터는 엘사, 예수, 히틀러 랩몬스터 박서준 가 있다.");
			}
		}
	
	}


