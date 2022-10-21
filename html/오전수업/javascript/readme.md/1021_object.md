### 👉 history 객체
- 사용자의 웹사이트 사용 내역
```
history.length : 히스토리 목록에 포함된 url의 수
history.back() : 뒤로 이동
history.forward() : 앞으로 이동
history.go( 2 ) : 현재 url 위치에서 2만큼 앞으로 이동, 
                음수라면 뒤로, 양수라면 앞으로 이동
```
- history.back() 과 history.forward() 잘못 사용하면 무한루프에 빠질 수 있으므로 유의해서 사용하기!


### 👉 Location 객체
- 현재 window의 url 주소에 대한 정보 제공 객체
```
location.host : 호스트 이름과 포트번호(url로부터 분리하여 제공)
                ex) www.naver.com:80(웰 노운 포트버호 : 생략가능)
location.hostname : url 주소에 대한 호스트 이름
location.href : 하이퍼링크로 주소 지정
location.pathname : 디렉토리 위치(호스트)
location.port : 호스트 포트번호
location.protocol : 프로토콜 종류
location.reload() : 문서 다시 읽기
window.location.assign(url 주소) : url로 이동(반문기록 저장)
window.location.replace(url 주소) : url로 이동(반문기록 덮어씀)
```

### 👉 navigator 객체
- 웹 브라우저의 특성 정보를 가지는 객체
```
navigator.appName : 사용중인 브라우저 종류
navigator.appCodeName : 사용중인 웹브라우저 이름
navigator.appVersion : 브라우저 버전 및 os 이름
navigator.plaform : 운영체제 환경
navigator.userAgent : 웹브라우저 종류와 버전
navigator.plugins : 설치된 플러그인 정보
navigator.mimeTypes : 브라우저에 지원되는 MIME  타입
```
- MIME 타입 종류
    ```
    text, image, audio. video, application, message, multiport
    ```
    ```
    image - gif, jpeg
    video - mpeg
    application - stream, script
    ```