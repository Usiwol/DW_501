package house;

public class aircon extends house_item {
	public int area;
	
	public aircon() {}
	public aircon(String brand, int price, int area) {
		// super - super는 부모이다.
		super(brand, price); // = house_item(brand, price);
		this.area = area;
	}
	public void buy() {
		System.out.println("에어컨을 구매하였습니다.");
	}
	
}
