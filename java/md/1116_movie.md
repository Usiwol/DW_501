## 👉 BufferedReader - 기본생성자 메서드가 없음, 매개변수있는 생성자만 존재함

```java
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

        // new movieVo(); // 새로운 공간을 만들고 생성자메서드로 초기화
		// movieVo m = new movieVo();

```

### 문제) 영화 총 4개 입력하여 출력까지

```java
    // 답안
    movieVo[] arr = new movieVo[4];
    arr[0] = new movieVo("한산",2022,15);
    arr[1] = new movieVo("한산",2022,15);
    arr[2] = new movieVo("한산",2022,15);
    arr[3] = new movieVo("한산",2022,15);

    for(movieVo data : arr)
    data.out();
    // 여기까지

    // 나의 (오)답
    list.add(new movieVo());
    list.get(0).title = "명량";
    list.get(0).year = "2014년";
    list.get(0).age = "15세 관람가";

    System.out.println("제목 : "+list.get().title+" , 개봉년도 : "+list.get().year+" , 관람등급 : "+list.get().age);

    Scanner sc = new Scanner(System.in);

    for(int i=0; i<arr.length; i++) {
    	arr[i] = new movieVo();
    	System.out.println("영화제목 : ");
    	arr[i].title = sc.nextLine();
    	System.out.println("개봉년도 : ");
    	arr[i].year = sc.nextLine();
    	System.out.println("관람등급 : ");
    	arr[i].age = sc.nextLine();
    }

    for(movieVo temp : arr)
    	temp.output();
    }
}

```

## 👉toString

```
- toString 메서드는 자바에서 일반적인 출력용 메서드이다.
```

<br>

### 문제) 영화제목, 개봉년도, 관람등급 생성자 메서드를 통해 데이터 저장가능하게 만들기. 출력 메서드 (제목, 년도, 등급 출력되어야 함)

```java
package movie;

    public class movieVo {
        private String title; // 영화제목
        private int year; // 개봉년도
        private int age; // 관람등급
        // 기본적인 생성자 메서드가 존재함
        // void movieVo() {}
        public movieVo() {} // 생성자 메서드
        public movieVo(String title, int year, int age) {
            this.title = title;
            this.year = year;
            this.age = age;
        }

        // toString 메서드는 자바에서 일반적인 출력용 메서드이다.
        @Override
        public String toString() {
        return "제목 : "+title+" , 개봉년도 : "+year+" , 관람등급 : "+age+"세이상";
        }

        // getter, setter
        public String getTitle() {
        return title;
        }
        public void setTitle(String title) {
        this.title = title;
        }
        public int getYear() {
        return year;
        }
        public void setYear(int year) {
        this.year = year;
        }
        public int getAge() {
        return age;
        }
        public void setAge(int age) {
        this.age = age;
        }
        public void out() {
        System.out.println("제목 : "+title+" , 개봉년도 : "+year+" , 관람등급 : "+age+"세이상");
        }
    }
```
