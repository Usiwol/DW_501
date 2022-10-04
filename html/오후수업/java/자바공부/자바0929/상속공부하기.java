package 자바0929;

//상속
//부모의 기능을 자식도 사용할 수 있다.
class 부모님{
	public void 아들아공부해야지() {
		System.out.println("아들아 공부해라!");
	}
	
	public void 아들아밥먹자() {
		System.out.println("아들아 밥먹자");
	}
}

//자식클래스에서 부모님 클래스를 상속받기
//새로운 용어 : extends
//프로그래밍에서 상속 : 부모의 기능을 자식이 물려받는다.
class 자식 extends 부모님{
	//ctrl + space bar
	// @Override : 오버라이딩 : 부모의 기능을 자식이 재정의하다.
	@Override
	public void 아들아공부해야지() {
		System.out.println("공부 하겠습니다!");
	}
	@Override
	public void 아들아밥먹자() {
		System.out.println("싫어요 게임할래요!");
	}
}


public class 상속공부하기 {
	
	public static void main(String[] args) {
		

	}

}
