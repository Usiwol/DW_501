### screen 
- 화면정보 제공
```javascript
screen.width : 화면의 전체 너비 (해상도 너비)
screen.height : 화면의 전체 높이 (해상도 높이)
screen.availWidth : 실제 사용 가능한 화면 너비
screen.availHeight : 실제 사용 가능한 화면 높이
screen.colorDepth : 사용 가능한 색상 수
screen.pixelDepth : 한 픽셀당 비트 수
```
### document 객체
```javascript
document.write("title : " + document.title +"<br>");
```

### 마지막 수정일
- document.lastModified : 마지막 수정한 시간이 몇시인지
```javascript
document.write("마지막 수정일 : " + document.lastModified + "<br>");
```
### 배경색
- 기본 배경색은 white
```javascript
document.bgColor = "pink";
document.wirte("배경색 : "+document.bgColor + "<br>");
```

### 링크색
```javascript
document.write("링크색 : "+document.linkColor + "<br>");
document.write("링크색 : "+document.alinkColor + "<br>");
document.write("링크색 : "+document.vlinkColor + "<br>");
```

### ⭐form
```javascript
<body>
    <form name="fm" method="get" action="save.html">
        <!-- input 태그 만들때 name 꼭 쓰기 -->
        <input type="text" name="id" id="id" value="admin">
        <input type="password" name="pw" id="pw">
        <input type="date" name="day" id="day">
        <input type="checkbox" name="fav" id="fav">
        <a href="javascript:view();">보기</a>
    </form>
</body>
```

```javascript
- 기존 방식
document.getElementById("day").value; 
- form 을 사용하는 경우
document.fm(form이름).id(input태그 id).value;
```
- form 태그 안에 input 태그를 가져오는 방법은 용이하다.
- form 같은 경우는 document 바로 하위 객체로 가능하다
    ```javascript
    document.write("길이 : " + document.forms.length + "<br>");
    document.write("첫번째 form name : " + document.forms[0].name + "<br>");
    document.write(document.forms.fm.name + "<br>");
    document.write(document.all.fm.name + "<br>");
    document.write(document.forms["fm"].name + "<br>");
    document.write(document.forms[0].elements[0].value + "<br>");
    ```

### 쿠키 
- 사용자가 브라우저 사용 중에 입력하거나 검색한 정보를 저장해 놓는 것
- 생존 시간을 지정 할 수 있기도 하고 기본 생존시간이 정해져 있기도 하다

- 특징
    - 최대 300개까지 사용가능
    - 하나의 쿠키 크기는 4KB로 제한
        - (문자하나의 크기 1byte, 1byte == 8bit )
    - 쿠키의 정보는 HTTP헤더를 통해 클라이언트 브라우저와 서버가 공유한다.
    - 사용자에 의해 웹페이지가 요청되면 Set-Cookie 필드에 의해 쿠키가 브라우저에 저장됨

Set-Cookie
- 유효기간, 보안정보 등을 포함
- 사용자가 다시 같은 페이지를 요청했을 때 저장되어 있던 쿠키가 발견되면 브라우저는
    웹 페이지를 요청하는 헤더에 쿠키필드를 포함하여 전송한다.
    쿠키의 내용은 암호화 되지 않는다.

Set-Cookie 구조
- name : 생성될 쿠키의 이름 (개발자가 꼭 해야할 작업)
- 값 : 쿠키에 저장될 데이터 (개발자가 꼭 해야할 작업)
- expires : 유효기간 지정
- path : 저장된 쿠키와 일치하는 url 의 path 와 도메인 값이 일치하는 url 페이지를
            요청하게 되면 해당쿠키가 서버로 전달
- domain : url 의 도메인 부분을 정의하는 것
- secure : 데이터 전송시 보안을 위한 프로토콜을 지정할 때 사용

