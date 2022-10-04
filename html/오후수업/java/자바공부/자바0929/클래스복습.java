package 자바0929;


// 클래스 C생성
class C{
	//클래스 안에 작성한 변수를 필드변수라고 한다.
	private String 이름;
	private int 나이;
	
	C(String 이름, int 나이){ //파라미터가 있는 생성자
		//System.out.println("이름: "+"<br>"+"나이 :");
	}
	C(){ // 파라미터가 없는 생성자
	
	
	}
	// ### 필드변수가 private여서 get,set 함수를 이용해서
	//필드변수 데이터를 대입하고 호출한다.
	
	//getter, setter
	public String get이름() {
		return 이름;
	}
	public void set이름(String 이름) {
		this.이름 = 이름;
	}
	public int get나이() {
		return 나이;
	}
	public void set나이(int 나이) {
		this.나이 = 나이;
	}
}

class B{
	//B라는 클래스 생성 후 메인 함수에 B클래스 호출
	B(int x, int y){
		System.out.println("B class : hello World");
	}
	// ### 오버로딩 : 메소드 이름은 같은데, 파라미터 타입이 다를 때
	B(){
		
	}
}

class A{
	//기본적으로 제공 == Default
	A(){ //메소드 ==> 생성자
		// 생성자는 메소드와 다르게 리턴타입이 없다. 
		// void,String 등..쓰지 않는다
	}
	public void A클래스에있는메소드() {
		System.out.println("hello world");
	}
	public int 메소드생성(int x) {
		return x;
	}
}

public class 클래스복습 {
	public static void main(String[] args) {
		//메인 메소드에서 A클래스에 있는 메소드 호출하기 (2분)
		A a = new A();
		// new A(); A클래스 호출
		//A a 불러온 클래스를 a라는 변수에 대입(인스턴스화 하다, 객체를 생성하다)
		a.A클래스에있는메소드(); //변수를 활용한 방범
		a.메소드생성(300);
		
		new A().A클래스에있는메소드(); //변수를 생성하고 클래스 호출 시 바로 메소드 호출
		
		B b = new B(50,100); // B라는 클래스를 호출할 때 디폴트 생성자도 자동으로 호출된다.
					//위에서 파라미터값 설정 후 여기서 파라미터 값을 설정해주지 않으면 오류 난다.

	}
}
