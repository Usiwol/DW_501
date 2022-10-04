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
    }
    
};