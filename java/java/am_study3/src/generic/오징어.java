package generic;

public class 오징어 extends seafood {
	public int among;
	public String origin;

public void store(int among, String origin) {
	this.among =among;
	this.origin = origin;
}
public 오징어 판매() {
	return this;
}
}
//데이터 타입 정해져서 안정적이게 사용가능