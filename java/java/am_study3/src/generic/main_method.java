package generic;

public class main_method {

	public static void main(String[] args) {
		
		seafood_box<오징어> 오징어박스 = new seafood_box<>();
		오징어박스.setBox(new 오징어());
		오징어박스.sellBox();
		
		seafood_box<새우> 새우박스 = new seafood_box<>();
		새우박스.setBox(new 새우());
		
		// 오징어박스는 <오징어> 객체만 담을 수 있게 설정해놨기 때문에 참치는 안됨
		// => 오징어박스.setBox(new 참치()); == 오류 
		
		seafood_box<seafood> 해산물박스 = new seafood_box<>();
		해산물박스.setBox(new seafood());
		해산물박스.setBox(new 오징어());
		해산물박스.setBox(new 참치());
		해산물박스.setBox(new 새우());
		//해산물박스.setBox(new 소고기());
		// 제너릭 사용할때 클래스 상속 기능을 이용해서 제한을 둘 수 있다.
		// 상속 안걸면 소고기도 들어올 수 있지만. seafood 클래스를 만들고
		// 해산물에만 상속을 해두었기에 소고기는 들어올 수 없는 것이다.
		
		구매 구매자 = new 구매();
		
//		구매자.buy(new 오징어());
		구매자.buy(오징어박스);
		구매자.buy(새우박스);
		
		
		
//		seafood<String> sea = new seafood<String>();
//		sea.store("김기원주율");
//		System.out.println(sea.판매());
//		
//		sea.store(1200);
		
		
		
//		ArrayList<Object> list = new ArrayList<>();
//		
//		list.add(100);
//		list.add(200);
//		list.add(300);
//		list.add(3.14);
//		list.add(짱영츄);
//		
//		System.out.println(list);
//			
	}

}