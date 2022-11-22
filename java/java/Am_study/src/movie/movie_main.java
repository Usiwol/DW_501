package movie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class movie_main {

	public static void main(String[] args) {
	
		List<movieVo> list = new ArrayList<>();
		
		String path = "c:/test/movie.txt";
		// 자동 닫아주기 기능
		try( BufferedReader file = new BufferedReader(new FileReader(path)) ) {		
			while(true) {
				String line = file.readLine();
				// 예외 처리
				if(line==null) break;
				String[] temp = line.split(" ");
				movieVo data = new movieVo(temp[0], Integer.parseInt(temp[1]), Integer.parseInt(temp[2]));
				list.add(data);				
				// System.out.println(line);
			}
			// file.close(); // 닫아주기

		}catch(Exception e){
			System.out.println("파일 없다");
		}
		
		
		for(movieVo data : list)
			System.out.println( data.toString() );
		
		movieVo d;
		Object obj;
		
		

		// BufferedReader - 기본생성자 메서드가 없음, 매개변수있는 생성자만 존재함
	
		// new movieVo(); // 새로운 공간을 만들고 생성자메서드로 초기화
		// movieVo m = new movieVo(); 
		
		
		
/*			
		
		// 답안
		movieVo[] arr = new movieVo[4];
		arr[0] = new movieVo("한산",2022,15);
		arr[1] = new movieVo("한산",2022,15);
		arr[2] = new movieVo("한산",2022,15);
		arr[3] = new movieVo("한산",2022,15);
		
		for(movieVo data : arr)
			data.out();
	
		// 여기까지
		
		list.add(new movieVo());
		list.get(0).movie_title = "명량";
		list.get(0).premiere_year = "2014년";
		list.get(0).viewing_class = "15세 관람가";
		
		System.out.println("제목 : "+list.get().movie_title+" , 개봉년도 : "+list.get().premiere_year+" , 관람등급 : "+list.get().viewing_class);
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = new movieVo();
			System.out.println("영화제목 : ");
			arr[i].movie_title = sc.nextLine();
			System.out.println("개봉년도 : ");
			arr[i].premiere_year = sc.nextLine();
			System.out.println("관람등급 : ");
			arr[i].viewing_class = sc.nextLine();
		}
		
		for(movieVo temp : arr)
			temp.output();
*/
		
		
	}

}

/*
 영화 총 4개 입력하여 출력까지
 */
