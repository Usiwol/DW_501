package cafe.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cafe.VO.food;
import cafe.VO.order_list;

public class food_DAO extends base_DAO {
	
	//주문내역
	public List<order_list> order_select(String id){
		List<order_list> list = new ArrayList<>(); 
		// 주문내역이 여러개 존재할 수 있기에 배열형태로 저장하기 위해 ArrayList 사용
		
		String sql = "select * from order_list where an_order=?";
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, id);
			rs = pt.executeQuery();
			while(rs.next()) {
				order_list data = new order_list(
						rs.getInt("order_seq"), rs.getString("food_name"), rs.getString("an_order"),
						rs.getInt("order_price"), rs.getInt("delivery_complete"), rs.getString("memo")
						);
			//DB에서 가저온 데이터들을 order_list객체로 하나씩하나씩 생성해주고 ArrayList 에 저장하긱
				list.add(data);
			}
			//반복문 종료되면 DB에서 가져온 모든 데이터를 저장해 주었다는 것
			return list;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public boolean order_insert(order_list data) {
		//매개변수를 order_list한 이유는 food_service에서 주문 내용들을 order_list의
		//객체에 저장하였기에 DB에 저장하려면 order_list객체의 값을 가져와서 저장해야 한다.
		//DB저장하기
		//1. sql문 작성하기
		//2. 자바에서 DB에 전달하기 위한 statement나 preparedStatement에 sql문 넣어주기(컬럼명 넣기)
		String sql="insert into order_list(food_name, an_order,order_price, memo) "
				+ "values(?,?,?,?) ";
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1,  data.getFood_name());
			pt.setString(2, data.getAn_order());
			pt.setInt(3, data.getPrice());
			pt.setString(4, data.getMemo());
			pt.executeUpdate(); //query - select, 조회,	 update - 변경, 추가, 삭제
			return true;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	

	public Map<Integer, food> food_list() {
		
		Map<Integer,food> food_map = new HashMap<>();
		
		
		String sql="select * from food";
		
		try {
			pt = conn.prepareStatement(sql);
			rs = pt.executeQuery();
			while(rs.next()) {//여러 레코드를 조회 했다면 반복문 처리
				food data = new food(rs.getInt("food_seq"), rs.getString("food_name"),
						rs.getInt("cost"), rs.getInt("cook_time"), rs.getInt("cal"), 
						rs.getString("allergy"), rs.getInt("order_quantity") );
				
				food_map.put(data.getFood_seq(), data);			
			}
			return food_map;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}		
		return null;
	}

}


/*
 
 	자바 컬렉션
 	
 	Collection (인터페이스)
 		1. List (인터페이스)
 			1) ArrayList (클래스) : 데이터 베이스를 가져올때 사용 (가장 많이 사용)
 				장점 : 속도가 빠르다 (access)
 				단점 : 추가삽입, 삭제하는데 속도가 느리다
 					속도가 느린이유 - 공간을 만든 다음에 하나씩 다 뒤로 미룬다음에 그 공간에 삽입추가
 								데이터가 많은 상태에서 추가삽입시 속도가 느려질 수 밖에 없다.
 			2) LinkdeList (클래스) : ArrayList 를 보완하기 위해 만들어 사용 / 연속적으로 저장되어 있지 않음
 									메모리 주소(공간)들을 이용해서 데이터들을 연결시켜 놓음	 / 두번째로 가장 많이 사용
 				장점 : 속도는 빠른편이다/ 추가,삽입이 빠르다
 				단점 :
 			3) vector : 
 			4) stack : 들어오는 곳과 나가는 곳이 같다 
 			FILO(first in last out) / LIFO(last in first out)
 			5) queue : FIFO(first in first out) / LILO(last in last out)
 			
 		2. Set (인터페이스) : 중복X / 순차적으로 데이터 저장 X / 
 			1) HashSet : 
 			2) TreeSet : 이진트리를 사용
 			
 	Map (인터페이스)
 		1. HashMap
 		2. HashTable : 
 		3. TreeMap : key와 value값 사용
 		4. Properties
 	
 	map 인터페이스는 키와 값의 쌍을 하나의 데이터로 저장한다.
 	데이터 접근은 키를 찾아 데이터를 리턴한다.
 	그래서 키는 중복으로 사용하지 않는 데이터로 저장해야 한다.( 회원의 고유번호, 도서관의 책번호, 주민번호 등등)
 	
 	Map 인터페이스의 메서드
 	V put(K key, V value) - k, v는 제네릭 <키, 값>으로 저장된다.
 	boolean containsKey(Object k) 맵에 키가 있다면 true, 없다면 false
 	boolean containsValue(Object v) 맵에 value가 있다면 true, 없다면 false
 	V get(Object k) - 키에 대칭되는 값을 리턴
 	
 	예시)
 	Map<String, member> m = new HashMap<String, member>();
 	
 		V put(K key, V value)
 	m.put("10가1234", new memeber("김유신") );
 		V put(K key, V value)
 		k - String, V - member
 	
 	m.containsKey("20사1234");
 		boolean containsKey(Object k)
 		Object - String 
 	
 		
 
 */
