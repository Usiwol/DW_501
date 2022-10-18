# window 객체 Method
1. alert( )
    ```sql
    메시지와 OK버튼을 가진 메시지 박스
    ```
2. setInterval
    ```sql
    지정된 시간만큼 반복
    ```
3. setTimeout
    ```sql
    지정된 시간 이후에 실행
    ```
4. clearInterval
    ```sql
    setInterval 해제
    ```
5. clearTimeout
    ```sql
    setTimeout 해제
    ```
6. close( )
    ```sql
    window 닫기
    ```
7. confirm
    ```sql
    질문 다이얼로그 확인과 취소 버튼을 가진 박스
    ```
8. back, forward
    ```sql
    뒤, 앞으로 이동
    ```
9. moveBy( x, y)
    ```sql
    window 이동(상대적)
    ```
10. moveTo( x, y)
    ```sql
    window 이동(절대적)
    ```
11. resizeBy( x, y) 
    ```sql
    window 크기변경 (상대적)
    ```
12. resizeTo( x, y) 
    ```sql
    window 크기변경 (절대적)
    ```
13. open
    ```sql
    새 window 생성
        예) url , window_name, property
    ```
    1. url
        ```sql
        페이지 주소
        ```
    2. window_name
        ```sql
        window_name : _blank(새창에 열린다.)
        window_parent : _blank(부모 프레임에서 열린다.)
        window_self : _blank(현재 페이지를 대체한다.)
        window_top : _blank(로드된 프레임셋 대체)
        ```
    3. property
        ```sql
        property : 새 window의 옵션 부여
        height : 새 창의 높이 지정
        width : 새 창의 너비 지정
        left : 모니터 화면 왼쪽에서부터 위치
        right : 모니터 화면 오른쪽에서부터 위치
        ```