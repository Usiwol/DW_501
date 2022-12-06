package class501;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

public class main_method {
	public static Map<String, ban_active> map = new HashMap<>();

	public static void init() {
		//ResourceBundle rb = ResourceBundle.getBundle("ban");
		// resourcebundle은 prop파일 읽어들일때 주로 사용
		// 웹에서 bundle의 사용처는 접속한 local(국가)에 따라 언어별 페이지 보여줄때 사용되기도 함
		// collection을 순차적으로 접근하며 사용하기 위한 인터페이스 iterator
		// prop은 컬렉션 이전에 나온 거라서 iterator사용불가
		// prop은 enumeration 사용
		//Enumeration key = rb.getKeys();// prop파일에서 key만 가져온다
		
		Properties prop = new Properties();
		try(FileReader fr = new FileReader("C:\\Users\\dw-027\\Desktop\\git_hub\\DW_501\\오후\\Java\\Am_study4\\src\\class501\\ban.properties")){
			prop.load(fr);
		}catch(Exception e) {
			e.printStackTrace();
		}
		Iterator key = prop.keySet().iterator();
		
		
		while (key.hasNext()) {// hasnext랑 비슷한거
			String cmd = (String) key.next();// .nextElement : prop파일의 key 하나씩 cmd에 저장
			String val = prop.getProperty(cmd);// key를 입력하여 value 구하여 val에 저장
			// class가 아닌 문자열이 들어온 것이고 클래스화 해야됨
			try {
				Class<?> hclass = Class.forName(val);// 문자열의 클래스화 => Class.forName("class501.computer");
				ban_active ban = (ban_active) hclass.newInstance();// 컴퓨터에 객체만들기(인스턴스생성)
				map.put(cmd, ban);
				// prop의 키를 map의 키로 저장, prop의 value는 객체생성하여 map의 value로 저장
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		init();
		
		System.out.println("이동할 페이지 입력 : ");
		System.out.println("computer chair desk people moniter");
		String page = new Scanner(System.in).nextLine();
		page += ".html";
		ban_active pg = map.get(page);// 키를 입력하여 해당 value 구하기
		
		pg.action(page);
		
	}

}