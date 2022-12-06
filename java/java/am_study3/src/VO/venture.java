package VO;

public class venture implements Comparable{
	private int num;
	private String company;
	private String addr;
	private String category;
	private String business_name;
	private String product;
	
	public venture() {}
	public venture(int num, String company, String addr, String category, String business_name, String product) {
		this.num = num;
		this.company = company;
		this.addr = addr;
		this.category = category;
		this.business_name = business_name;
		this.product = product;
	}
	
	@Override
	public boolean equals(Object obj) {
//		사용자정의 클래스에서equals를 구현할 때 어떤 대상을 비교할 것인지 정해야 한다.
//		그냥 equals 메서드가 동작 안하는 이유는 비교대상이 없기 때문에 동작 못하는 것
// 		그래서 클래스에서 equals를 구현해서 비교하는 것
		venture tmp = (venture)obj;
		System.out.println(this.company);
//		if(this.num == tmp.num)
//			return true;
		if(this.company.equals(tmp.company))
			return true;
		return false;
	}
	
	@Override
	public int compareTo(Object o) {
		venture tmp = (venture)o;
		return this.company.compareTo(tmp.company);
	}
	@Override
	public int hashCode() {
		return this.company.hashCode();
	}
	@Override
	public String toString() {
		return num + " " + company + " " + addr + " " + category + " " + business_name +" "+ product;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBusiness_name() {
		return business_name;
	}
	public void setBusiness_name(String business_name) {
		this.business_name = business_name;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	
}