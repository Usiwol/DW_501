package test2;

import java.util.ArrayList;
import java.util.List;

import test1.member;

public class main1 {

	public static void main(String[] args) { // main - 메서드 // 클래스 메서드
	// int[] a = new int[10];	
	
		// 한번 정한 배열의 크기는 변경할 수 없다.
		// ArrayList - 배열의 크기를 변경할 수 있는 동작을 할 수 있다.
		List<member> list = new ArrayList<>();
		
		list.add(new member() );
		list.get(0).성별 = "남자";
		list.get(0).아이디 = "end";
		

		/*
		member.count = 10;
		
		
		member[] arr = new member[5]; // arr - 지역변수
		// 클래스타입의 배열 생성하면 배열의 각 공간은 클래스타입의 참조변수 공간이다.
		
		// arr[0] = new member(); // 인스턴스변수 생성
		
		// arr[0].아이디	 = "li";
		// arr[0].성별 = "여자";
		// arr[0].주소 = "대전 서구 둔산동";
		// arr[0].이름 = "윤재영";
		
		// for(int i=0; i<arr.length; i++)
			
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = new member();
			System.out.print("아이디 : ");
			arr[i].아이디 = sc.nextLine();
			System.out.println("이름 : ");
			arr[i].이름 = sc.nextLine();
			System.out.println("주소 : ");
			arr[i].주소 = sc.nextLine();
			System.out.println("성별 : ");
			arr[i].성별 = sc.nextLine();
			
		}
		
		for(member temp : arr)
			temp.output();
		
		
		// final int a = 10;
		// a = 20; ==> 불가능 
	*/
	}

}

/*
 * < 제어자 >
 * final : 데이터 변경을 할 수 없다.
 * 	예)	final int a = 10;
		a = 20; ==> 불가능 
		
 * static : 클래스의... 공통적인
 * 		static 변수
 * 			- 모든 인스턴스에 공통적으로 사용되는 클래스 변수
 * 			- 클래스변수는 인스턴스를 생성하지 않고도 사용가능
 * 			- 클래스가 메모리에 로드될때 생선된다.
 * 		statci 메서드
 * 			- 인스턴스를 생성하지 않고도 호출이 가능한 static 메서드
 * 			- *** static 메서드에서는 인스턴스변수와 인스턴스 메서드 사용불가 (주의하기)
 * 
 * abstract - 추상적인, 추상화 작업
 * 
 * 접근 제어자
 * 		public - 제한없이 사용가능, 클래스, 변수, 메서드
 * 		default - 같은 패키지에서만 사용가능
 * 		protected - 같은 패키지에서만 사용가능, 상속인 경우 예외
 *  	private - 같은패키지라도 사용불가, 누구든 사용불가, 오직 해당 클래스내부에서만 사용가능
 *  
 *  
 *  자바 : 지역변수, 인스턴스변수, 클래스변수
 * 	지역변수 : 메소드 안에 만들어진 변수
 * 			생성 - 선언 { 시작시 생성
 * 			종료 - } 종료시 종료
 * 	인스턴스변수 : 클래스 내부에 만들어진 변수(클래스 멤버변수)
 * 				객체수와 동일
 * 			생성 - 클래스 객체 생성시
 * 			종료 - 클래스 객체 종료시
 * 	클래스변수: static이 붙은 변수
 * 			하나 밖에 없지만 누구든 사용할 수 있는 공간
 * 			생성 - 프로그램 로드
 * 			종료 - 프로그램 종료
 * 
 *  로드 : 하드디스크에 있는것을 메모리에 넣어주는 과정
 */





