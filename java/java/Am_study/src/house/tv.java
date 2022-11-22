package house;

public class tv extends house_item {
	public int inch;
	
	public tv() {}
	public tv(String brand, int price, int inch) {
		super(brand, price); // = house_item(brand, price);
		// super - super는 부모이다.
		// super(b, p) 는 부모클래스 생성자 호출
		// super는 자식 클래스생성자에서 가장 먼저 실행될 수 있게 해야한다.
		// super가 가장위에 있어서 가장먼저 실행되는걸로 되어 있어야 한다.	
		this.inch = inch;
	}
	public void buy() {
		System.out.println("tv를 구매하였습니다.");
	}

}
/*
 	public tv() {
		super();
	}
	public tv(int p) {
		
	}
 	
 	
 	public int ch=2; // 명시적 초기화
	public int sound;
	
	
	static{ // 클래스 초기화 블럭 - 클래스변수만 초기화
		
	}
	
	{// 인스턴스 초기화 블럭 - 인스턴스변수와 클래스 변수를 초기화
		ch = 10;
		sound = 8;
	}
 */




/*
	👉 변수의 초기화
	변수초기화 방법
		1. 생성자메서드를 통해 초기화
			- 생성자 메서드 객체 생성시 실행
			 
		2. 초기화블럭을 통한 초기화
			- 초기화블럭은 프로그램이 로드된 뒤에 딱 한번 실행
			
		3. 명시적 초기화
			- 직접 변수에 데이터를 넣어놓고 시작
			
	👉 변수 초기화 순서
	인스턴스 변수 초기화 순서
		명시적 초기화 -> 초기화 블럭 -> 생성자메서드
		 
	클래스 변수 초기화 순서
		명시적 초기화 -> 초기화 블럭 
		
*/