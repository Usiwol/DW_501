package house;

public class computer extends house_item {
	public String vga;
	
	public computer() {}
	public computer(String brand, int price, String vga) {
		// super - super는 부모이다.
		super(brand, price); // = house_item(brand, price);
		this.vga = vga;
	}	
	
	public void buy() {
		System.out.println("컴퓨터를 구매하였습니다.");
	}
}
