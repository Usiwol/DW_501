package house;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class file {
	private String path;
	
	public file() {}
	public file(String path) {
		this.path = path;
	}
	
	public void save(List<house_item> list) {
		
	} 
	
	public List<house_item> load() {
		
		List<house_item> list = new ArrayList<>();
		try( BufferedReader bfr = new BufferedReader(new FileReader(path))) {
			while(true) {
				String line = bfr.readLine();
				// 예외처리
				if(line == null) break;
				String[] temp = line.split(" ");
				switch(temp[0]){
					case "tv":
						list.add(new tv(temp[1], Integer.parseInt(temp[2]), Integer.parseInt(temp[3])));
						// list.add(t);
						break;
					case "에어컨":
						list.add(new aircon(temp[1], Integer.parseInt(temp[2]), Integer.parseInt(temp[3])));
						break;
					case "컴퓨터":
						list.add(new computer(temp[1], Integer.parseInt(temp[2]), temp[3]));
						break;
				}
			}
			return list;
			
		}catch(Exception e) {
			// catch : 오류 동작시 작동
			// 오류 메시지를 보여줌
			e.printStackTrace();
		}
		
		return null;
	
	}
}
