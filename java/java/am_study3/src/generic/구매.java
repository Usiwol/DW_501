package generic;

public class 구매 {

	public void buy(seafood_box<? super seafood> item) {
		System.out.println("해산물 구매함");
	}
}
//여기서 public void buy(seafood_box<seafood> item) 라고 사용하면
// seafood_box에 seafood인 것만 가능이란 뜻임
// 상속받은 애들은 buy사용못함

//super 클래스 : 옆에 있는 클래스 포함 상위클래스 사용가능
//extends 클래스 : 옆에 있는 클래스의 하위클래스도 사용가능