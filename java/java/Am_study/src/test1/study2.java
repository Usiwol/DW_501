package test1;

public class study2 {

	public static void main(String[] args) {
		
		System.out.println(" 나는 자바다. 너는? ");
		// " 문자열 " (큰따옴표)
		
		System.out.println();
		
		// 자바 출력 방법
		System.out.println(" 출력방법1 ");
		// ln == line : 한줄에 출력해라! 한줄로 출력이 됨, 줄바꿈이 가능
		System.out.print(" 출력방법2 ");
		// 연속적으로 출력됨
		System.out.printf(" 출력방법3 ");

		System.out.printf(" %d	%f	%s	\n	줄바꿈도 된다. \n\n ㅋ",100, 3.14, "자바");
		/*
		 *	%d - 정수
		 *	%f - 실수
		 * 	%s - 문자열
		 */
		System.out.println("  "+100+"  "+3.14+"  자바   ");
		System.out.println(" 줄바꿈도 된다. ");
		
		int age = 34;
		
		System.out.println("너는 "+age+"살이냐 ?");
		
		
		
		// 한줄주석
		/*
		 * 여
		 * 러
		 * 줄
		 * 주
		 * 석
		 */

	}

}
