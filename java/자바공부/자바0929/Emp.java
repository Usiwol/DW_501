package 자바0929;

/*
 * 새롭게 Emp 라는 클래스 파일을 생성해주세요
 * Emp클래스에는 메인함수가 없습니다.
 *
 * 필드변수는
 * int 사원번호
 * String 사원이름
 * int 급여
 * int 보너스
 * 이고 모두 private 입니다

 * 생성자는 기본 생성자와 파라미터 타입 int 사원번호, String 사원이름,
 * int 급여, int보너스가 있는 생성자 총 2개를 생성해 주세요.

 * 메소드는 getter, setter만 만들어주세요!!
 */
public class Emp {
		// 필드변수
		private int 사원번호;
		private String 사원이름;
		private int 급여;
		private int 보너스;
		//생성자(리턴 타입이 없는 메소드)
		Emp(){
			
		}
		Emp(int 사원번호, String 사원이름, int 급여, int 보너스){
			// 파라미터로 받아온 값을 필드변수에 대입하겠다.
			this.사원번호 = 사원번호;
			this.사원이름 = 사원이름;
			this.급여 = 급여;
			this.보너스 = 보너스;
		}
		
		//메소드 (함수)
		//getter,setter
		public int get사원번호() {
			return 사원번호;
		}
		public void set사원번호(int 사원번호) {
			this.사원번호 = 사원번호;
		}
		public int get급여() {
			return 급여;
		}
		public void set급여(int 급여) {
			this.급여 = 급여;
		}
		public int get보너스() {
			return 보너스;
		}
		public void set보너스(int 보너스) {
			this.보너스 = 보너스;
		}

}


