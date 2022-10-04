package 자바0927;

class A{ //A클래스 시작
	int value = 100; //value 탄생 (필드 변수)
	/*
	 * ### 필드변수 특징 ###
	 * 1. 전역(전체)으로 활용 가능
	 * 2. 기초값을 지정하지 않아도 된다. 예) int value; (O)
	 * 	  기본값(default)이 존재
	 */
	
	//static을 안써는 이유? 접근제어자는 option !
	public void 확인하기() {
		int x = 50; // x라는 이름을 가진 변수 탄생
		int y;  // 오류! ==> y라는 값이 없어서 y를 출력 or 사용시 오류발생.
		System.out.println("A클래스에 있는 메소드 입니다.");
		System.out.println(value);
	} // x 생을 마감
	
}//A클래스 끝 ==> value 생을 마감

//문제 1.
//B라는 이름을 가진 클래스 생성
//리턴값이 void 이고 파라미터 타입이 없는
//확인하기 메소드 생성
//
//메인메소드에서 B클래스에 있는 확인하기 메소드 호출하기
//
//결과 : B클래스에 있는 메소드 입니다
class B{ //B클래스 시작
	public void 확인하기() { //메소드 시작
		System.out.println("B클래스에 있는 메소드 입니다.");
	} //메소드 끝
} //B클래스 끝


//문제2.
//클래스 이름 : C
//필드변수 : String str, int value
//1.메소드 : 
//	리턴타입 : boolean
//	메소드 이름 : 메소드 만들기
//	파라미터타입 : 없음
//2.메소드 :
//	리턴타입 : int
//	메소드 이름 : 메소드만들기
//	파라미터타입 : double x, double y
class C{//C클래스 시작
	String str; //필드변수
	int value; //필드변수
	// ### 리턴타입이 있으면 리턴을 꼭 써주자! ###
	// 접근제어자 public static 사실 optional(선택)이다.
	boolean 메소드만들기() {
		//true or false 를 리턴
		return true;
	}
	int 메소드만들기(double x, double y) {
		return 0;
	}
	//class B를 리턴하겠다.
	B 메소드만들기(B b) {
		return b;
	}
} //C클래스 끝

public class Home {
	
	//static void 홍길동
	
	//static 메소드는 static 메소드 혹은 인스턴스화 된 메소드만 올 수 있다.
	public static void main(String[] args) {
		A a클래스 = new A(); //new A() ==> A클래스를 호출하다.
		a클래스.확인하기();//a클래스에 있는 확인하기 메소드(==함수) 사용

		B b클래스 = new B();
		b클래스.확인하기();
		
	}

}
