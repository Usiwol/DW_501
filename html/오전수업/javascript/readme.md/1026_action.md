## calc
- 모바일과 pc의 크기가 같게 나오게 하기 위해 이 공식 사용하기!
```
가변길이적용할길이값 / 적용할 박스를 감싸고 있는 박스의 가로너비) * 100  
````
    1. 최대 너비값 정하기
    2. 요소별 너비값 px로 길이 값 구하기
    3. 가변 길이값 구하는 식으로 %로 변환하여 작성  

```html
예)

    <div class="image-box imgb1">
        안녕?
    </div>

    width: 360px 인 경우
        --> (360 / 1000) * 100
        --> 36%

    .imgb1{
        width: 36%;
        background: pink;
         /* font-size: 5vw; */
        font-size: 5vmin;
    }
```
## 가변폰트단위
```
1. vw(viewport width) 
2. vh(viewport height) 
3. vmin : 브라우저의 너비, 높이 중 작은 값 기준
4. vmax : 브라우저의 너비, 높이 중 큰 값 기준
```
<br>
<br>

# 플렉서블 박스 - flex
- display에 flex가 적용된 박스는 부모박스(플레서블박스)
- 부모박스 하위 태그들은 자식박스(플렉스 아이템)

## 플렉서블 박스의 방향
- 플렉스의 방향은 축에 따라 다르다. (주축, 교차축)
    ```
    주축이 가로일 경우 플렉스 아이템들은 왼쪽에서 오른쪽으로 배치
    주축이 세로일 경우 플렉스 아이템들은 위에서 아래로 배치
    ```

## 플렉스 속성
- display : flex, inline-flex ( 모든 태그 적용 )
    ```
    1. flex - 박스를 블록 수준의 플렉서블 박스로 작동
    2. inline-flex - 박스를 인라인 수준의 플렉서블박스로 작동
    ```

## 아이템 배치 방향
- flex-derection : row(기본), row-reverse, column, column-reverse
    ```
    1. row - 박스를 왼쪽에서 오른쪽으로 배치
    2. row-reverse - 박스를 가로로 배치하되 역방향으로 배치
    3. column - 박스를 위에서 아래로 배치
    4. colunm-reverse - 박스를 세로로 배치하되 역방향으로 배치
    ```
## 아이템 배치 방식
- flex-wrap - nowrap(기본값), wrap, wrap-reverse (플렉서블박스에 적용)
    ```
    1. nowrap - 박스를 한줄로 배치
    2. wrap - 박스를 여러줄로 배치
    3. wrap-reverse - 박스를 여러줄로 배치하되 역방향배치
        - 주축이 가로일 때 (direction:row) 아래에서 위로
        - 주축이 세로일 때 (direction:column) 오른쪽에서 왼쪽으로
    ```
    
## 플렉스 아이템배치와 방향 한번에
- flex-flow 
    ```
    flex-flow:row-wrap;
    ```