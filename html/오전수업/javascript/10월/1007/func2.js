

/*

    1. window.onload 에서
    전역으로 3개의 정수값 배열로 저장

    2. 3개의 정수값은 중복없음(범위 : 1~9 )

    3. button 클릭하면 number_input 함수 실행
    4. number_input 함수에서 세개의 input 값 가져오기
    5. number_input 함수에서 number_check 함수 실행
    6. number_check 함수에서 input값 3개 전달
    7. number_check 함수에서 input 값과 배열과 비교하기
    8. print함수에서 div#result 에 일치하는 값이 몇개 인지 출력

*/
var n = new Array();

// 중복값 없애기
while ( n.length != 3 ){
    let num = Math.floor(Math.random() * 9 ) + 1;
    if( n.indexOf(num) ==  -1){
        n.push(num);
    }
}

window.onload = function(){
    var number

}