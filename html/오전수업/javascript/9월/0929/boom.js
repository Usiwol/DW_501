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
            // 이미지를 넣지 않을시에는 필요 없음
            // 폭탄표시 1은 폭탄
            // if(board[i*20+k] == 1)
            //     table += '<td><img src="../../image/boom.png"</td>';
            // else
                table += "<td class='bm' data-idx=" + (i * 20 + k) + "></td>";
            }
        table += "</tr>";
    }
    // table += "</table>";
    document.getElementById("wrap").innerHTML = table;
    
    var bm = document.getElementsByClassName("bm");

    //alert(bm.length);
    //bm[0].style.background = 'red';

    for(var i in bm){
        // 모든 <td>에 이벤트를 넣어주겠다는 뜻
        // 동작하는 함수를 직접 만들 때
        bm[i].addEventListener('click',function() {
            // idx 값을 가져오기
            let n = this.dataset.idx;
            // bm == board 의 인덱스는 같다.
            if (board[n] == 1){
                this.style.background =
                'url(../../image/boom.png) no-repeat center center';
                this.style.backgroundSize = 'cover';
                // this.innerHTML='<img src="../../image/boom.png">';
            }else this.style.background = 'rgb(230,230,230)';           
            // this : 현재 작업하는 <td>를 의미함 ==> bm[i]
            // this.style.background = 'rgb(230,230,230)';
        });
    }    
}; // table 닫아주는 표시?