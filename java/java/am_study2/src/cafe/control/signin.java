package cafe.control;

import java.util.Scanner;

import cafe.BO.member_service;
import cafe.DAO.member_DAO;

public class signin implements menu_able{

	@Override
	public boolean menu_active() {
		
		Scanner sc = new Scanner(System.in);	
		member_service ms = new member_service();
		String id=null, name=null, tel=null, email=null, allergy;
		do {
		
		System.out.println("회원가입 양식");
		
		//============================
		
		System.out.println("아이디 : ");
			id = sc.nextLine();
		System.out.println("이름 : ");
			name = sc.nextLine();
		System.out.println("연락처 : ");
			tel = sc.nextLine();
		System.out.println("이메일 : ");
			email = sc.nextLine();
		System.out.println("알레르기(알레르기가 없다면 x) : ");	
			allergy = sc.nextLine();
			
		//======== 입력 항목 ============
		
		
		}while ( !(ms.sign_member(id, name, tel, email, allergy)) );
		
		return true;
	}

}
