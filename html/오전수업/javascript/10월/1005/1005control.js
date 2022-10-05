// control.js


// addEventListener : 태그에 이벤트 설정하는 함수
// addEventListener("이벤트",이벤트발생시동작함수)


window.onload = function () {
    var add = document.querySelector("#add");
    // id 가 add인 버튼에 이벤트 추가하기   
    // 첫번째 방법 --> add.addEventListener("click", function(){}) 
    add.addEventListener("click", tag_add); // -- >두번째 방법
};

// 추가버튼 1번만 실행되게 하기
var add_check = false;  // 전역변수

function tag_add(){ // 두번째 방법 
    // 추가버튼 1번만 실행되게 하기
    if(add_check){
        return;
    }
    add_check = true;

    var Pdiv = document.querySelector("#score_wrap");
    var div  = document.createElement("div");

// 4개의 input tag 만들어서 score_wrap에 넣어주기
    var ipt = document.createElement("input");
    ipt.setAttribute("type", "text");
    ipt.setAttribute("id", "name");
    ipt.setAttribute("placeholder", "이름");
    div.appendChild(ipt);

// 반복문으로 나머지 3개 input태그 만들어주기
// 반복문에 사용할 배열 만들기
    var course = [["국어", "kor"],["수학", "mat"],["영어", "eng"]];
    //  course[0][0] --> 2차원 배열: 1차원 배열안의 1차원 배열 만들어주기  
    for(let i = 0; i < 3; i++){
        ipt = document.createElement("input");
        ipt.setAttribute("type", "number");
        ipt.setAttribute("id", course[i][1]);
        ipt.setAttribute('placeholder', course[i][0]);
        div.appendChild(ipt);
    }
    var bt = document.createElement("button");
    bt.addEventListener("click", enroll);
    // 버튼에 글씨 넣어주기
    var text = document.createTextNode("등록");
    bt.appendChild(text);

    div.appendChild(bt);
// input 태그들을 새div에 넣고 score_wrap 에 추가하기

    Pdiv.appendChild(div); // score_wrap  div추가
}

function enroll(){
    // 성적등록 이후 다시 추가 버튼 실행할 수 있게 하기
    add_check = false;

    var name = document.querySelector("#name").value;
    var kor = document.querySelector("#kor").value;
    var mat = document.querySelector("#mat").value;
    var eng = document.querySelector("#eng").value;

    var Pdiv = document.querySelector("#score_wrap");

    // score_wrap div에 추가하는 작업
    var div = document.createElement("div");
    div.setAttribute("class", "score");

    var data = [name, kor, mat, eng];
    for(let i in data){ // input 태그에 입력된 값을 h3 태그에 삽입
        let h =  document.createElement("h3");
        let text = document.createTextNode(data[i]);
        h.appendChild(text);
        div.appendChild(h);
    }
    // 추가되기 전 기존 input 태그 지우고 추가되게 하기

    var input = Pdiv.lastChild;
    Pdiv.removeChild(input); // input태그 삭제

    Pdiv.appendChild(div);  // input 태그값 div에 삽입
}