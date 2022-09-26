package 자바0913;

public class 메소드공부7 {
	
	public static int getNum(int x, String y) {
		return 0;
	}
	//문제1 아래 메소드 main메소드에 호출해서 결과 확인하가
	public static int getNum(int x, String y, String z) {
		return 10;
	}
	//문제2 메소드 만들고 메인함수 호출
	public static boolean isTrue(boolean x, String y) {
		return false;
	}
//	main메소드 호출하고 결과확인하기
	public static String getStr() {
		return "피자빵";
	}
	
	public static int 피자빵주세요(int 빵) {
		return 빵;
	}
	public static int 돈을인출하다(int 돈, String 계좌) {
		if(계좌.equals("카카오뱅크")) {
			return 돈;
		}
		if(계좌.equals("농협")) {
			return 돈;
		}
		return 0;
	}
	
	public static int 돈을해외로송금하다(int 금액, String 해외) {
		if(해외.equals("수리남")) {
			return 500;
		}
		return 금액;
	}
	
	public static int 섯다패를돌리다(String 금액) {
		if(금액.equals("장땡")) {
			return 500;
		}
		if(금액.equals("38")) {
			return 1000;
		}
		return 0;
	}
	
	public static boolean 말해YesOrNo(String 가수) {
		if("지코".equals("가수")) {
			 return true;
		 }
		 if("지코".equals("지코")) {
			 return false;
		 }
		 return true;
	}
	public static String 나는가수다() {
		if(1!=1) {return "뉴진스";}
		if(1==1) {return "아이브";}
		return "아이들";
	}
	public static void 무한도전(String 멤버이름) {
		if(멤버이름.equals("박명수")) {
			System.out.println("Hello");
		}
		if(5==5) {
			System.out.println("Hello");
		}
	}
			
	public static void main(String[] args) {
		
			int x=getNum(10, "붕어빵");//메서드 호출
			//메소드에 리턴이 있으면 대입이 가능하다.
		
			int y=getNum(10, "붕어빵","피자붕어빵");
				System.out.println(y);
			boolean isX=isTrue(true, "붕어빵");
				System.out.println(isX);
			String word=getStr();
				System.out.println(word);
			int 빵 = 피자빵주세요(100);
				System.out.println(빵);
			int 돈 = 돈을인출하다(3000,"카카오뱅크");;
				System.out.println(돈);
			int 금액 = 돈을해외로송금하다(300,"이탈리아");
			System.out.println(금액);
			int 섯다패= 섯다패를돌리다("39");
			System.out.println(섯다패);
			말해YesOrNo("지코바");

	}

}
