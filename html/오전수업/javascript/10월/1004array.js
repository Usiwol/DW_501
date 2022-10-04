// 1004array.js


// window.onload : html문서의 모든 내용이 브라우저에 표시된 이후에 동작
// window객체 : 브라우저
// window에만 onload 있는거 아님, 모든 객체(html태그포함)에 존재
// load --> 불러오기     즉, onload는 불러오는 작업이 끝났을 때 동작

var item_list = ["핸드폰거치대","급속충전기","C타입케이블","강화유리",
    "스마트폰 링","스마트폰 커버"];

window.onload = function () {
    // li 태그 가져오기
    var li = document.getElementsByClassName("item");
    // var li = document.qurrySelectorAll(".item");
    // 여기서 li의 구조는 배열구조 --> li[0]

    // for(var i=0; i<li.length; i++)
    for (var i in li) {  
        //for ( in ) : 배열구조에서 사용
        li[i].innerHTML = item_list[i];
    };
};
    
var item = new Array();
function enroll() {
    var name = document.getElementById("item_name");
    // var name = document.qurrySelector("#item_name");

    var prop = name.value;
    // ul 태그쪽에 li 태그로 감싸서 넣어주는 작업
    item.push(prop);

    // 실습) 제품 등록하면서 제품가격과 함께 등록할 수 있게 만들기
    var price = document.querySelector("#item_price");
    
    var ul = document.querySelector("#item_list");

        // 새로운 li태그 만들기
        var li = document.createElement("li"); // li 태그 생성

    li.innerHTML = item[item.length - 1]; // li 태그안에 제품명 삽입
    //  li.innerHTML = item[item.length - 1] + " " + price.value+"원";

    // 실습) 제품 등록하면서 제품가격과 함께 등록할 수 있게 만들기
    var b = document.createElement("b");
    b.innerHTML = price.value + "원";
    li.appendChild(b);

    // 삭제버튼 만들기
    var bt = document.createElement("button");
    bt.setAttribute("class", "del_bt");
    bt.setAttribute("onclick", "del(this)");

    bt.innerHTML = '삭제';
    li.appendChild(bt);

    ul.appendChild(li); // ul 태그 자식으로 li 추가

    // innerHTML : 내용입력시 이전 내용이 사라지고 새로운 내용이 들어옴
    // ul.innerHTML = item[i];
    // appendChild : 기존태그를 지우지 않고 추가하는 방법
    // appendChild 라는 태그를 쓰려면 node 라는 것이 필요함
    // tree구조에서 태그를 node라고 부름
    

    // 새 태그(엘리먼트, 요소, 객체)를 생성하는 방법 : createElement() 함수

    // 태그(엘리먼트) 내부에 새로운 내용으로 삽입하는 방법 : innerHTML
    // 태그(엘리먼트) 내부에 새로운 내용을 추가하는 방법 : appendChild
    // 태그(엘리먼트) 내부에 텍스트 형식으로 삽입하는 방법 : appendChild(textnode)
    // #a div
}

// 삭제버튼을 누를시 삭제가 되도록 하기
function del(obj) { // obj == li 태그
    var parent_li = obj.parentNode;
    var parent_ul = parent_li.parentNode;
    parent_ul.removeChild(parent_li);
}

/*
    ### 이론 정리 ###

    document.createElement : 새 태그 생성
    예시) doccument. createElement("div"); div 생성

    appendChild : 자식 태그로 추가
    예시) p = document.creatElement("p");
    body.appendChild(p);    : body에 p태그 추가

    setAttribute : 태그에 새속성 추가
    예시) setAttribute("id,"ppp");     : 해당 태그에 id = ppp 삽입

    removeChild : 자식 태그 삭제
    예시) body.removeChild(p);     : body 태그에서 해당 태그 삭제
*/

/* 
    실습.
    제품 등록하면서 제품가격과 함께 등록할 수 있게 만들기
    제품 가격 입력하는 input 만들어서 등록
    예시) 거치대 3000원 삭제
*/

