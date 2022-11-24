package cafe.BO;

import cafe.DAO.member_DAO;

public class member_service {
	private member_DAO mdao = new member_DAO();
	
	public boolean login(String id, String pw) {
		boolean chk = mdao.login(id, pw);
		if(chk) {
			System.out.println("아이디 또는 비번을 정확하게 입력해주세요.");
			return true; // 로그인 실패 - 아이디, 비번 틀렸거나, 없는 경우
		}else 
			
			return false; // 로그인 성공 - 아이디, 비번이 일치하는 경우
	}
	
	// 아이디와 이메일의 중복여부 확인
	public boolean sign_member(String id, String name, String tel, String email) {
		boolean check = mdao.id_check(id, email);
		// id_check 메서드를 통해 아이디와 이메일의 중복여부 확인
		// 중복이면 회원가입 안됨
		if(check) {// 중복이라면
			System.out.println("아이디 또는 이메일이 중복입니다.");
			return false; // 회원가입 signin.java로 리턴됨
		}else // 중복이 아니라면
			mdao.member_insert(id, name, tel, email);
		System.out.println("회원가입 성공");
		
		return true;
	}
}
