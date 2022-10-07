// 진행순서
// total 함수 실행 --> score_input함수의 kor, mat, eng 변수값 total에 전달
// --> total함수에서 kor,mat,eng의 합을 tot 변수에 저장
// --> tot 변수의 값 total 함수 실행 위치로 반환 (return)
// --> score_input 함수에서 total 함수로부터 반환된 값 tot변수에 저장
// --> score_input 함수에서 avg 함수 실행
// --> score_input 함수의 tot 변수를 avg 함수에 전달
// --> avg 함수에서 전달받은 데이터를 tot 변수에 저장


function score_input(){ // 코드블럭
    var kor = 99; // 지역변수
    var mat = 89;
    var eng = 79;
    // 총점과 평균 구하기
    total(kor,mat,eng);
    // var tot = total(kor,mat,eng);
    // var res = avg(tot);
    // result_print(res);
    return [kor, mat, eng]; // 여러개를 return 시킬 때 --> 배열의 형식으로!

}
function total(kor,mat,eng){ // 총점 계산
    var tot = kor + mat + eng;
    avg(tot);
    // return tot;
}
function avg(tot){ // 평균 계산
    var res = tot / 3;
    result_print(res);
    // return res;
}
function result_print(res){ // 결과 계산
    document.write("평균 : " + res);
}