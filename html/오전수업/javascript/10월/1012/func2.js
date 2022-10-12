/*
html 작업
1. input 1개 생성(생년원일입력 : 1999.01.02)
    생년원일 입력, 너비 200, 높이 35, 폰트 17
2. button 1개 생성
    입력, 너비100, 높이37, 폰트15
3. div #birthday 생성
4. div #birthday 하위 태그로 ul 태그 생성
5. ul 태그 하위로 li태그 3개
    (각각 li에 태어난 년도, 태어난 월, 나이)

javascript 작업
1. 버튼 이벤트 생성, 함수 input
2. input 함수에서 value 값 가져오기
3. getYear 함수(태어난년도 구하기)
4. getMonth 함수 (태어난 월 구하기)
5. getAge 함수(나이 구하기)
*/

window.onload = function(){
    document.getElementById('bt').addEventListener("click", input);
};

function input(){
    var birth = document.getElementById("birth").value;
    // 년도,월,나이 구하기
    var birth_year = getYear(birth);
    var birth_month = getMonth(birth);
    var age = getAge(birth);

    var info = document.getElementsByClassName("info");
    info[0].innerHTML = birth_year;
    info[1].innerHTML = birth_month;
    info[2].innerHTML = age;
}

function getAge(birth){
    year = birth.split(".");
    age = 2022 - parseInt(year) + 1;
    return age;
}

function getMonth(birth){
    month = birth.split(".")[1];
    return month;
}

function getYear(birth){
    year = birth.split(".")[0];
    return year;
}


/* 오답 대잔치
// 1. 버튼 이벤트 생성, 함수 input
window.onload = function(){
    document.getElementById('bt').addEventListener("click", input);
};

// 2. input 함수에서 value 값 가져오기
function input(){
    var bd = document.getElementById("bd");
    var day = bd.value;
    var a = new Array();
    a.push(day.split("."));
    
    list_push(bd.value);
    bd.value = '';
    bd.focus();
}

// 태어난년도 구하기
function getYear(){
    // 추가할 값을 input 태그에서 불러오기
    var year = document.getElementById('bd').value;
    // 추가할 li 엘리먼튼 생성
    var li = document.createElement("li");
    // li에 id 속성 추가
    li.setAttribute('id',bd);
    // li 에 text node 추가
    var textNode = document.createTextNode(bd);
    li.appendChild(textNode);
    // 생성된 li를 ul에 추가
    document.getElementById('birthday').appendChild(li);
}

*/