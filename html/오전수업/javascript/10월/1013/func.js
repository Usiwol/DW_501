
// 가위바위보 
// 유저입력하는 함수
// 컴 랜덤값 구하는 함수
// 승패구하는 함수 만들기


user(); // 실행되도록 설정해주기

function user(){ // 유저
    var u = parseInt(prompt("1.가위 2.바위 3.보"));
    var c = com();
    result(u,c);
}
function com(){ //컴
    var c = Math.floor(Math.random()*3)+1;
    return c;
}
function result(u, c){ //가위바위보 결과
    if(u == c){
        alert("비김");
    }else if( (u == 1 && c == 3 ) || (u == 2 && c == 1) || (u == 3 && c == 2)){
        alert("이김");
    }else{
        alert("패배");
    }
}