package command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import DAO.venture_DAO;
import VO.venture;

public class main_cmd {
	private static venture_DAO vdao = new venture_DAO();

	public static void main(String[] args) {
		List<venture> list = vdao.Select_all();
		
		TreeSet<venture> sw = new TreeSet<>();
		TreeSet<venture> build = new TreeSet<>();
		
		Iterator<venture> it = list.iterator();
		while(it.hasNext()) {
			venture temp = it.next();
			if(temp.getCategory().contains("정보처리"))
				sw.add(temp);
			if(temp.getCategory().contains("건설"))
				build.add(temp);
				
		}
		System.out.println(sw);
	
		String a = "hot";
		String b = "apple";
		System.out.println(a.compareTo(b));// a와 b의 사전적 순서의 차이
		System.out.println(b.compareTo(a));//java에서 정렬은 -여야된다(= 정렬은 기본 오름차순이니까!)
		
		//treeset 메서드(검색)
		//floor(객체) - 지정된 객체와 같은 객체를 찾아서 반환하거나, 없으면 작은 값 중에서 가까운 객체반환
		//headSet(객체) - 지정된 객체보다 작은 객체 모두 반환
		//tailSet(객체) - 지정된 객체보다 큰 객체 모두 반환
		//higher(객체) - 지정된 객체보다 큰 값으 ㄴ가진 객체 중에서 가장 가까운 객체, 없으면 null
		//lower(객체) - 지정된 객체보다 작은 값을 가진 객체 중에서 가장 가까운 객체, 없으면 null
		//subSet(객체1, 객체2) - 범위 검색, 객체1부터 객체2 전까지 객체들 반환
		
		List<venture> sw_list = new ArrayList<>(sw);
		System.out.println(sw.floor(sw_list.get(5)));
		
		System.out.println(sw.headSet(sw_list.get(3)));
		System.out.println(sw.lower(sw_list.get(10)));
		
		System.out.println(sw.subSet(sw_list.get(2), sw_list.get(4)));
		
		venture srh = new venture();
//		srh.setCompany("고");
		srh.setCompany("(주)골나");
		sw.add(srh);
		System.out.println(sw.headSet(srh));
		//TreeSet 검색방법 : 이진트리 안에 저장되어 있는 값 기준으로 검색
		// 이진트리 안에 저장되었는 값은 객체의 주소 값이 저장되어 있다.
		// 검색시에 저장되어있는 순서에 의해서 결과 값이 나온다
		// 그러므로 위와 같이 검색하고자 하는 회사이름을 따로 입력해서 객체를 생성하여 
		// 검색에 사용하는 방식은 트레셋 안에 없는 값이기 때문데 검색이 이뤄지지 않는다.
	}
}
		
/*		
//		for (venture i : v) {
//			System.out.println(i.getNum() + i.getCompany() + i.getAddr() + i.getCategory() + i.getBusiness_name()
//					+ i.getProduct());
//		}
		Set<String> category = new HashSet<>();
		//set : 중복허용x
		Iterator<venture> it = list.iterator();
		while(it.hasNext()) {
			category.add(it.next().getCategory());
		}//업종별 분류 
		Set<venture> retail = new HashSet<>(); // 카테고리 중 도소매업
		Set<venture> sw = new HashSet<>();	// 정보처리 sw
		Set<venture> build = new HashSet<>(); // 건설, 운수
		it = list.iterator();
		while(it.hasNext()) {
			venture data = it.next(); // 벤처테이터들을 하나씩 data에 저장
			if(data.getCategory().contains("도소매업"))
				retail.add(data);
			if(data.getCategory().contains("정보처리"))
				sw.add(data);
			if(data.getCategory().contains("건설"))
				build.add(data);
			}
	System.out.println(sw.size());
	
	venture a = new venture(list.get(0).getNum(),list.get(0).getCompany(),
			list.get(0).getAddr(), list.get(0).getCategory(),
			list.get(0).getBusiness_name(),list.get(0).getProduct());
	
	venture b = new venture(list.get(0).getNum(),list.get(0).getCompany(),
			list.get(0).getAddr(), list.get(0).getCategory(),
			list.get(0).getBusiness_name(),list.get(0).getProduct());	
	
	//정보처리 집합과 도소매 집합의 차집합 구하기 => addr기준
	//정보처리 집합과 도소매 집합의 교집합 구하기 => addr기준
	
	
	Set<String> addr_gyo = new HashSet<>();
	Set<String> addr_cha = new HashSet<>();
	
	Iterator<venture> gp = sw.iterator(); //	
	while(gp.hasNext()) {
		venture temp = gp.next();
		if(retail.contains(temp))
			continue;
			addr_cha.add(temp);
	}
	List<venture> cha_list = new ArrayList<>(addr_cha);
	System.out.println(cha_list.size());
	for(venture tmp : cha_list)
		System.out.println(tmp);
	Iterator<venture> gp1 = sw.iterator(); //	
	while(gp1.hasNext()) {
		venture temp = gp1.next();
		if(retail.contains(temp))
		addr_gyo.add(temp);
	}
	List<venture> cha_list = new ArrayList<>(addr_gyo);
	System.out.println(cha_list.size());
	for(venture tmp : cha_list)
		System.out.println(tmp);
	
//	
//	while(test.hasNext()) {//retail
//		String name = test.next();
//		if(name1.contains(name))//name1 내부에 name2 값이 있는가?
//		gyo.add(name);
//	}
//	System.out.println(gyo);
//
//	test= name2.iterator();
//	while(test.hasNext()) {// name2의 데이터를 name1에 있는지 비교하여 없으면 저장
//		String name = test.next();
//		if(name1.contains(name))//name1 내부에 name2 값이 있는가?
//		continue;// name1 내부에 name2 값이 있다면 이를 제외한 나머지
//		cha.add(name);
//	}
//	System.out.println(cha);
//	
//	
	
	
	
	if(a.equals(b))
		System.out.println("같다");
	else 
		System.out.println("다르다");	
	
	
	if(list.contains(a))
		System.out.println("있다");
	else
		System.out.println("없다");
// contains처럼 내장 클래스에서 비교가 필요한는 동작을 하는 것들은 equals 메소드 동작함 
// a그룹에 b가 있냐? => a클래스의 멤버와 b를 비교 => equals가 있어야 동작
// 비교로 해야하는 집합 표현시 equals 필수
	
	
	
	
	
//	차집합, 교집합, 합집합
// 주소를 기준으로 ....
	Set<String> name1 = new HashSet<>();
	Set<String> name2 = new HashSet<>();
	
	name1.add("김유신"); 	name1.add("이순신"); 	name1.add("김춘추");
	name1.add("장영주"); 	name1.add("김기원"); 	name1.add("윤재영");
	name1.add("이지현"); 	name1.add("미지연"); 	name1.add("최윤도");
	
	name2.add("김민정"); 	name2.add("김오리진"); 	name2.add("김춘추");
	name2.add("장영주"); 	name2.add("이종빈"); 	name2.add("윤재영");
	name2.add("이지현"); 	name2.add("변크리스탈"); 	name2.add("리정수");
	
	
// set : 인터페이스
// HashSet : 클래스
	HashSet<String> hab = new HashSet<>();
	HashSet<String> cha = new HashSet<>();
	HashSet<String> gyo = new HashSet<>();
	
	Iterator<String> test = name1.iterator();
	while(test.hasNext()) {// name1의 데이터를 hab에 저장
		hab.add(test.next());
	}
	test= name2.iterator();
	while(test.hasNext()) {// name2의 데이터를 hab에 있는지 비교하여 없으면 저장
		String name = test.next();
		if(hab.contains(name))//hab 내부에 name 값이 있는가?
			continue;
		hab.add(name);
	}
	System.out.println(hab);
	
	test= name2.iterator();
	while(test.hasNext()) {// name2의 데이터를 name1에 있는지 비교하여 없으면 저장
		String name = test.next();
		if(name1.contains(name))//name1 내부에 name2 값이 있는가?
		gyo.add(name);
	}
	System.out.println(gyo);
	test= name2.iterator();
	while(test.hasNext()) {// name2의 데이터를 name1에 있는지 비교하여 없으면 저장
		String name = test.next();
		if(name1.contains(name))//name1 내부에 name2 값이 있는가?
		continue;// name1 내부에 name2 값이 있다면 이를 제외한 나머지
		cha.add(name);
	}
	System.out.println(cha);
	
	}
	
	
*/
