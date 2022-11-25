package cafe.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import cafe.VO.member;
import cafe.control.event;
import cafe.control.exit;
import cafe.control.login;
import cafe.control.menu_able;
import cafe.control.order;
import cafe.control.signin;

public class cafe_main {
	public static Scanner sc = new Scanner(System.in);
	public static member user = null;
	
	public static void main(String[] args) {
		// 인터페이스 사용시
		menu_able[] menu = {new order(), new login(), 
				new event(), new signin(), new exit()};
	
		// 무한루프
		// 인터페이스 사용시
		while(menu[main_menu() -1 ].menu_active());
	}
	
	public static int main_menu() { // 클래스 메서드 - 클래스 메서드에서만 사용
		int select = 0;
		
		String[] menu = {"주문", "로그인", "이벤트", "회원가입", "종료"};
			try {
				for(int i=1; i<=menu.length; i++) {
					if(user!=null && ( i==2 || i==4 ))
						continue;
					System.out.println(i+". "+menu[i-1]);
				}
				/*
				System.out.println("1. 주문");
				System.out.println("2. 로그인");
				System.out.println("3. 이벤트");
				System.out.println("4. 회원가입");
				System.out.println("5. 종료");
				*/
				System.out.println("선택 : ");
				select = sc.nextInt();
				if( select < 1 || select > 5 )
					// throw : 강제로 오류내는 것
					throw new InputMismatchException("잘못입력했습니다.");
			}catch(Exception e) {
				System.out.println( e.getMessage() );
				sc.nextLine();
				// 잘못 입력했을 경우 다시 실행될 수 있도록 다시 넣어주기
				select = main_menu();
			}
			return select;
	}
}

/*
	재귀호출 
	

*/