package generic;

// public class seafood_box <T extends seafood & 인터페이스>
// 제네릭에 사용되는 타입종류
// T - 타입, V - 값, K - 키, N - 숫자
// seafood_box <T,V>



public class seafood_box<T extends seafood> {

	T box_item;
	
	public void setBox(T box) {
		this.box_item= box;
		
	}
	public void sellBox() {
		System.out.println("해산물 박스를 판매했습니다.");
	}
	
}

