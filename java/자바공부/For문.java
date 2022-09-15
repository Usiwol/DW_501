package 자바0913;

import java.util.Scanner;

public class For문 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("값을 입력해주세요 => ");
		int num = scan.nextInt();
		System.out.println("값은 "+num );
		/*
		 * 문제1. num에 값을 입력받았을 때 num을 x로 나눈 나머지가 1이 되도록
		 * 하는 가장 작은 자연수 n을 출력하시오.
		 * ex) num이 10이라고 가정하면 가장 작은 자연수는 3입니다.
		 * 제한사항 : num은 3 <= num <= 1000 입니다.
		 * hint. while or for문을 이용해서 풀어보세요!
		 */
		for(int i=3; i<=1000; i++) {
			if((num%i)==1) {
				System.out.println("가장 작은 자연수는 "+i);
				break;
			}
		}
		/*
		 * 문제2. 3부터 6까지 숫자 총합을 구하시오(for문으로)
		 * 3+4+5+6=18
		 */	
		int sum=0;
		for(int i=3; i<=6; i++) {
			sum += i;	
		}System.out.println("3부터 6까지 숫자 총합은 "+sum);
		
	}
}
		
		

		
		
		
		
		
		
		/*for문 실행순서
		 * 1. int i=0;
		 * 2. i<10;
		 * 3. 코드실행;
		 * 4. i++;
		*/
		//int i=0;	-> i를 살리려면 여기에 써주면 오께	
		//for(int i=0; i<10; i++) { // i 출생
			
		//} 		
		//System.out.println(i); //i는 이미 for문 끝날 때 새을 마감함.

