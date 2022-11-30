package command;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import DAO.venture_DAO;
import VO.venture;

public class main_cmd {
	
	//private static venture_DAO vdao = new venture_DAO();
	
	public static void main(String[] args) {
		
		venture_DAO vdao = new venture_DAO();
		List<venture> list = vdao.Select_all();
	
		/*for(venture v : list) {
			System.out.println(v.getNum()+". 업체명 : "+v.getCompany()
				+" 주소 : "+v.getAddr()+" 업종분류 : "+v.getCategory()
				+" 업종명 : "+v.getBusiness_name()+" 주생산품 : "+v.getProduct());
		}*/
		
		Set<String> category = new HashSet<>();
		
		Iterator<venture> it = list.iterator();
		while(it.hasNext()) {
			category.add(it.next().getCategory());
		}
		
		Set<venture> retail = new HashSet<>(); //도소매업
		Set<venture> sw = new HashSet<>(); //정보처리, sw
		Set<venture> build = new HashSet<>(); //건설,운수
		
		//Iterator는 일회성이라 값을 다시 넣어줘야 다시 사용 가능!
		it = list.iterator();
		while(it.hasNext()) {
			venture data = it.next(); //벤처데이터들을 하나씩 data에 저장하기
			if(data.getCategory().contains("도소매업"))
				retail.add(data);
			if(data.getCategory().contains("정보처리"))
				sw.add(data);
			if(data.getCategory().contains("건설"))
				build.add(data);
		}
		System.out.println(sw.size());
		//System.out.println(category);
		
		//차집합, 교집합, 합집합
		//주소를 기준으로 ...
		
		HashSet<String> name1 = new HashSet<>();
		HashSet<String> name2 = new HashSet<>();

		name1.add("김유신");	name1.add("이순신");	name1.add("김춘추");
		name1.add("장영주");	name1.add("김기원");	name1.add("윤재영");
		name1.add("이지현");	name1.add("미지연");	name1.add("최윤도");
		
		name2.add("김민정");	name2.add("김민서");	name2.add("김춘추");
		name2.add("장영주");	name2.add("이종빈");	name2.add("윤재영");
		name2.add("이지현");	name2.add("변크리스탈");	name2.add("리정수");
		
		HashSet<String> hab = new HashSet<>(); //합집합
		HashSet<String> cha = new HashSet<>(); //차집합
		HashSet<String> gyo = new HashSet<>(); //교집합
		
		//HashSet 사용시 Iterator 꼭 써주기!
		Iterator<String> test = name1.iterator();
		while(test.hasNext()) { //name1의 데이터를 hab에 저장
			hab.add(test.next());
		}
		test=name2.iterator();
		while(test.hasNext()) {//name2의 데이터를 hab에 있는지 비교하여 없으면 저장
			String name=test.next();
			if(hab.contains(name)) //hab내부에 name 값이 있는가??
				continue;
			hab.add(name);
		}
		System.out.println(hab);
		
		//교집합
		test=name2.iterator();
		while(test.hasNext()) {
			String name = test.next();
			if(name1.contains(name))
				gyo.add(name);
		}
		System.out.println(gyo);
		
		//차집합
		test=name2.iterator();
		while(test.hasNext()) {//name2와 name1의 차집합, name2에만 있는 이름 찾기
			String name = test.next();
			if(name1.contains(name))
				continue;	
			cha.add(name);
		}
		System.out.println(cha);
	}
}
