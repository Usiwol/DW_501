// boom.js

var board = new Array(400);
board.fill(0); //배열에 채우기

for(var i=0; i<200;){
    // pos 인덱스 자리에 폭탄이 들어감
    let pos = Math.floor(Math.random()*400 );
    //중복제거
    if(board[pos] != 1){
        board[pos] = 1;
        i++;
    }
}



window.onload = function(){
    var table = "<table>";
    for(var i=0; i<20; i++){
        table += "<tr>";
        for(var k=0; k<20; k++){
            // 폭탄표시
            if(board[i*20+k] == 1)
                table += '<td><img src="../../image/boom.png"</td>';
            else
                table += "<td> </td>";

            }
            table += "</tr>";
    }
    table += "</table>";
    document.getElementById("wrap").innerHTML = table;
}