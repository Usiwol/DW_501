package class501;

public class computer implements ban_active{

	@Override
	public String action(String msg) {
		System.out.println("컴퓨터다.");
		return null;
	}

}
// implement의 사전적 의미 - 구현하다, 도구, 수단
// 인터페이스를 클래스에 implements 해주면 해당 클래스는 인터페이스가 가진 추상 메서드를 가지게 된다.
// 추상메서드를 가진 클래스는 추상클래스(public abstract class...)가 되거나
// 추상메서드를 구현해야만 한다.
// 추상클래스가 되면 객체생성이 불가이다.