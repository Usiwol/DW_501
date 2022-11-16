# 👉 class

1. 유사한 특징을 묶어 놓은 집합체
2. 필드변수와 메서드로 구성
3. 객체를 생성하기 위한 틀
4. 객체지향언어에만 있는 용어

<br>

# 👉 오버로딩 & 오버라이딩

## 오버로딩

- 메서드이름은 같으나 매개변수 다르게 혹은 리턴타입 다르게

## 오버라이딩

- 부모클래스 메서드를 재정의

<br>
<br>

### 문제1) arrayList을 생성 후 sawon1 ~ sawon10 add하기!

### 문제2) 직원 총 급여 구하기

### 문제3) 직원 평균 급여 구하기

### 문제4) 직업이 MANAGER고 급여가 2500이상받는 사원 수 구하기

### 문제5) 가장 급여를 많이 받는 사원의 이름과 직업 조회하기

```java
package 자바1115;

public class Emp {

	String ename; // 사원이름
	int sal; // 급여
	String job; // 직업

	// 필드변수를 초기화할 수 있는 생성자 생성하기
	public Emp(String ename, int sal, String job) {
		this.ename = ename;
		this.sal = sal;
		this.job = job;
	}
}
```

```java
package 자바1115;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Home {

	public static void main(String[] args) {

        Emp sawon1 = new Emp("SMITH",160,"CLERK");
		Emp sawon2 = new Emp("ALLEN",1600,"SALESMAN");
		Emp sawon3 = new Emp("WARD",1250,"SALESMAN");
		Emp sawon4 = new Emp("JONES",2975,"MANAGER");
		Emp sawon5 = new Emp("MARTIN",1250,"SALESMAN");
		Emp sawon6 = new Emp("BLAKE",2850,"MANAGER");
		Emp sawon7 = new Emp("CLARK",2450,"MANAGER");
		Emp sawon8 = new Emp("SCOTT",3000,"ANALYST");
		Emp sawon9 = new Emp("KING",5000,"PRESIDENT");
		Emp sawon10 = new Emp("TURNER",1500,"SALESMAN");

		//문제1. arrayList을 생성 후 sawon1 ~ sawon10 add하기!
		List<Emp> elist = new ArrayList<Emp>();
		elist.add(sawon1);
		elist.add(sawon2);
		elist.add(sawon3);
		elist.add(sawon4);
		elist.add(sawon5);
		elist.add(sawon6);
		elist.add(sawon7);
		elist.add(sawon8);
		elist.add(sawon9);
		elist.add(sawon10);

		int sum = 0;
		int avg = 0;
		int count = 0;
		int max = 0;
		int sawon = elist.size();
		String name = "";
		String job = "";

		for(Emp list : elist) {
			//문제2. 직원 총 급여 구하기
			sum += list.sal;

			//문제3. 직원 평균 급여 구하기
			avg = sum/sawon;

			//문제4. 직업이 MANAGER고 급여가 2500이상받는 사원 수 구하기
			if(list.job.equals("MANAGER") && list.sal >= 2500)
				count++;

			//문제5. 가장 급여를 많이 받는 사원의 이름과 직업 조회하기
			if(list.sal > max) {
				max = list.sal;
				name = list.ename;
				job = list.job;
			}
		}
        // 출력하기
		System.out.println("직원 총 급여 : "+sum);
		System.out.println("직원 평균 급여 : "+avg);
		System.out.println("사원 수 : "+count);
		System.out.println("가장 급여를 많이 받는 사원 이름 : "+name+", 직업 : "+job);
	}

}
```
