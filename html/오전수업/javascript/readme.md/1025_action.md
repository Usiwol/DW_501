# meta
- 화면 크기에 대한 정보를 제공해준다    
### 👉 meta viewport
- content
    
    - width = device=width
        ```
        문서를 장치의 화면 너비에 일치시킬 것을 지시
        ```
    - initial-scale=1
        ```
        페이지 처음 접속 했을때 보여지는 비율 설정
        1로 되어있으면 100%를 의미함
        1.5의 경우 1.5배를 의미함
        ```
    - user-scalable
        ```
        사용자의 축소/확대 여부(yes/no)
        (ctrl + 마우스 사용해서 확대/축소 시키는경우)
        ```
    - minimum-scale : viewport의 최소 배율값(0~10)
    - maximum-scale : viewport의 최대 배율값(0~10)

    <br>

# media
### 👉 미디어 쿼리 : @media 미디어유형 논리연산자 (특성) { 태그 { 속성:값 } }
<br>

```html
[ @media + (미디어쿼리구문) + 미디어유형 ]
@media only screen and (max-width:600px){
    body{background-color: pink;}
}
```

### 👉 미디어 유형
```
1. all : 모든 디바이스
2. print : 인쇄 결과물 및 인쇄 미리보기
3. screen : 화면대상
4. tv : 음성과 영상이 동시에 출력되는 TV
5. aural : 음성 합성 장치에서 사용할 경우
6. hanheld : pad와 같은기기 (손에 들고 다니는 장치)
7. projection : 빔 프로젝트
```
### 👉 미디어 쿼리 구문 (논리 연산자)
1. only
    ```
    미디어 쿼리를 지원하지 않는 웹 브라우저에서는 미디어 쿼리를 무시하고 실행하지 않는다
    ```
2. not : not 다음에 지정하는 미디어 유형 제외
3. and : 조건을 여러개 연결
4. , (comma) : 여러 조건 중 하나라도 해당되면 실행 (or 연산자) 
<br>
<br>

### 👉 미디어 쿼리 특성
1. width, height : 웹페이지의 너비, 높이 조건
2. min-width, min-height : 웹페이지의 최소 너비, 높이
3. max_width, max-height : 웹페이지의 최대 너비, 높이
4. device-width, device-height : 기기의 너비, 높이
5. device-min-width,device-min-height : 기기의 최소 너비, 높이
6. device-max-width,device-max-height : 기기의 최대 너비, 높이
7. orientation : 모바일의 세로(portarait), 가로(landscape)
<br>
<br>

### 👉 미디어쿼리 사용 전에 고려해야 할 부분
- 모바일 우선 적용일 경우 
    - 작은사이즈 -> 큰사이즈 순으로 작성
    - 모바일 크기에서 웹사이트 제작 후 크기별로 반응하도록 제작
    - 모바일버전으로 제작 완료 후 태블릿 -> 데스크탑 순으로 제작한다.
    - (모바일 사용 용도일 경우 미디어쿼리로 작성하지 않는다.)
    ```
    모바일 우선일 경우는 min을 사용
    데스크탑 우선일 경우는 max를 사용
    ```

### 👉 크기 단위
1. px : 절대길이, 디스플레이 장치의 픽셀 1개의 크기
2. % : 상대길이, 기본 크기에 대해 상대적인 크기를 가지는 단위
    ```
    ex) 100% = 16px;
    ```
3. rem : 상대길이, 해당 폰트의 대문자 M의 너비를 기준으로 하는 단위
    - html 태그에 비례해서 반응)
    - 🎈 반응형에서 많이 사용 🎈 )
    <br>

        ```
        ex) 1rem = 16px;
            2rem = 32px;
        ```
4. em : 상대길이, 해당 폰트의 대문자 M의 너비를 기준으로 하는 단위
    - 부모태그의 폰트 크기를 기준으로 배율 설정
    - 🎈 반응형에서 많이 사용 🎈
    <br>

        ```
        ex) 1em = 16px;
        ```