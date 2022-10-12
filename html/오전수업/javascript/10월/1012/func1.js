/*
html 작업
1. input 2개 생성 - 너비 150, 높이 35, 둥근모서리
2. 버튼 1개 생성 -> text - 입력, 너비 80, 높이 35
    검정바탕 흰색글씨, 글씨크기 15px, 이름과 직업 입력
3. div 생성 -> id - output, 너비300, 화면한가운데표시

자바스크립트 작업
1. 입력버튼 클릭시 이벤트 생성 - 함수명 input
2. input함수 -> 두 input value 값 가져오기
3. list_push 함수 -> 두개 value 값 input 함수로부터 받아서 배열 list에 저장
4. output_list 함수 -> 배열 list의 값 div#output 에 출력
        이름 출력영역 너비 150, 높이 30
        직업 출력영역 너부 150, 높이 30
*/

// 1. 입력버튼 클릭시 이벤트 생성 - 함수명 input
window.onload = function(){
    document.getElementById('bt').addEventListener("click", input);
};

function input(){
    // 2. input함수 -> 두 input value 값 가져오기
    var name = document.getElementById("name");
    var job = document.getElementById("job");

    // input 엘리먼트 객체로 가져오기
    list_push(name.value, job.value);
    // input value 값 list_push에 넘기기
    name.value=''; // name input 초기화
    job.value=''; // job input 초기화
    name.focus(); // name input 에 커서 이동
}

//  두개 value 값 input 함수로부터 받아서 배열 list에 저장
var list = new Array();
function list_push(name, job){
    var out = "<span>"+name+"</span><span>"+job+"</span>";
    list.push(out);
    // 배열은 하나인데 저장한 데이터는 두개
    // list.push([name, job]);
    // 객체형태로 다루는 방법
    // list.push({n : name, j : job})
    output_list();
}

function output_list(){
    var div = document.getElementById("output");
    var out = "";
    for(var i in list){
        out += list[i];
    } // alert(out);
    div.innerHTML = out;
}


/*
var name_list = new Array();
var job_list = new Array();

window.onload = function(){
    var bt = document.querySelector("#bt");
    bt.addEventListener("click", input);
};

function input(){
    var text = document.getElementsByClassName('text');
    name_list.push(parseInt(text[0].value));
    job_list.push(parseInt(text[1].value));
    result(text);
}
function result(text){
    div.appendChild(document.creatTextNode);
    div.appendChild(document.creatTextNode);
    document.querySelector("#output").innerHTML = result;
}
*/