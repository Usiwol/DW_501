# window 객체 Method
1. alert( )
    ```
    메시지와 OK버튼을 가진 메시지 박스
    ```
2. setInterval
    ```
    지정된 시간만큼 반복
    ```
3. setTimeout
    ```
    지정된 시간 이후에 실행
    ```
4. clearInterval
    ```
    setInterval 해제
    ```
5. clearTimeout
    ```
    setTimeout 해제
    ```
6. close( )
    ```
    window 닫기
    ```
7. confirm
    ```
    질문 다이얼로그 확인과 취소 버튼을 가진 박스
    ```
8. back, forward
    ```
    뒤, 앞으로 이동
    ```
9. moveBy( x, y)
    ```
    window 이동(상대적)
    ```
10. moveTo( x, y)
    ```
    window 이동(절대적)
    ```
11. resizeBy( x, y) 
    ```
    window 크기변경 (상대적)
    ```
12. resizeTo( x, y) 
    ```
    window 크기변경 (절대적)
    ```
13. open
    ```
    새 window 생성
        예) url , window_name, property
    ```
    1. url
        ```
        페이지 주소
        ```
    2. window_name
        ```
        window_name : _blank(새창에 열린다.)
        window_parent : _blank(부모 프레임에서 열린다.)
        window_self : _blank(현재 페이지를 대체한다.)
        window_top : _blank(로드된 프레임셋 대체)
        ```
    3. property
        ```
        property : 새 window의 옵션 부여
        height : 새 창의 높이 지정
        width : 새 창의 너비 지정
        left : 모니터 화면 왼쪽에서부터 위치
        top : 모니터 화면 위쪽에서부터 위치
        ```
        - 모든 브라우저에서 작동하는 것 X (chrome에서 모두 불가능)
        ```
        channelmode : 전체화면 (yes,no)
        fullscreen : 전체화면 (yes, no)
        location : 주소표시줄 표시여부 (yes,no) 
                    -> 오페라에서만 적용됨
        menubar : 메뉴바 표시여부 (yes, no)
        scrollbars : 스크롤바 표시여부 (yes, no)
        status : 상태바 표시여부(yes, no)
        resizable : window 크기 변경 가능 여부(yes, no)
        toolbar : 툴바 표시여부(yes, no)
        ```
