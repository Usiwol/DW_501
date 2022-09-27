package 자바0913;

import java.util.Scanner;

public class 자바기초2 {

	public static void main(String[] args) {
		
		// ctrl + shift + o : 자동 임포트
		Scanner scan = new Scanner(System.in);
		System.out.print("값을 입력해주세요 => ");
		int num = scan.nextInt();
		System.out.println("값은 "+num );
		if((num%2) == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		// 받아온 값이 짝수면 짝수입니다. 아니면 홀수입니다. 출력해보시오
		
		
		
//		int x = 10;
//		// if(조건)
//		// = (대입연산자) , ==(같다), !=(다르다)
//		if(x == 10) {
//			int y = 0; // y 출생
//		} // y는 생을 마감
//
//		
//		int a = 3; // a 출생
//		if(x > 3) {
//			a = 10;
//		}
//		
//		int a = 3; // 전역 변수
//		if(x > 3) {
//			a = 10;
//			int y = 20; // 지역 변수
//		}
//		
//		int x = 20;
//		if(20 == 20) {
//			++x;
//		}else {
//			x = x + X;
//		}
		// X의 최종값은? -> 정답: 21
		

	} //a 마감
}
		
//			System.out.println("A");
//		}
//		if(x>5) {
//			System.out.println("실행");
//		}
//		
//		if(3 == 4) {
//			System.out.println("IF 실행");
//		}else {
//			System.out.println("ELSE 실행");
//		}
	
	
