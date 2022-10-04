package 자바0927;

public class Home3 {

	public static void main(String[] args) {
		
		영화관 a영화관 = new 영화관();
		a영화관.set직원수(20);
		int 직원수 = a영화관.get직원수();
		System.out.println("직원 수 : "+ 직원수);

		a영화관.set영화관위치("대전 둔산동");
		String 영화관위치 = a영화관.get영화관위치();
		System.out.println("영화관 위치 : "+ 영화관위치);
		
		a영화관.set영화관이름("CGV 둔산점");
		String 영화관이름 = a영화관.get영화관이름();
		System.out.println("영화관 이름 : "+ 영화관이름);
	}

}
