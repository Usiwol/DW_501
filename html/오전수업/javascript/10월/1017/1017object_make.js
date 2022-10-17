
// 객체명 : tb
//     행,열,너비,높이 입력하고 세팅 버튼 클릭시
//     tb객체에 값 저장, 저장 후 tb객체 배열에 저장

//     저장이 완료된 세팅 버튼을 다시 클릭시
//     해당 객체 값을 #draw 에 출력하기

function tb(col,row,wd,hg){
    this.col = col;
    this.row = row;
    this.width = wd;
    this.height = hg;
}

var tb_list = new Array();
var bt_cnt = 0; // 전역변수
var bt_check = false; // 전역변수
// new array = new Array();

window.onload = function(){
    var add_bt = document.querySelector("#add");
    // id가 add인 버튼에 이벤트 추가하기
    add_bt.addEventListener("click", add_button);

    var T_put = document.getElementsByClassName("T_put");
    for(var i in T_put){
        // keyup , keydown , focus
        T_put[i].addEventListener("keyup", function(){
            if( !bt_check ){
            alert("새로운 세팅버튼을 추가하세요")
            this.value = '';
            }
        });
    }
};

function add_button(){
    var bt = document.createElement("button");
    // ++ 가 앞에 붙으면 먼저 증가하는 것을 의미함
    bt.appendChild(document.createTextNode("세팅"+(++bt_cnt)));
    bt.setAttribute("data-value","0");
    bt.addEventListener("click",function(){
        if(this.dataset.value == 0) // input 값 저장하기 전
            value_save(this);
        else // input 값 저장 이후
            table_draw(this);
    });    
    document.getElementsByClassName("add_wrap")[0].appendChild(bt);
    bt_check = true;
}

function table_draw(obj){
    var draw = document.querySelector("#draw");

    var data = tb_list[parseInt(obj.dataset.value)-1];

    draw.innerHTML = data.col+" "+data.row+" "+data.width+" "+data.height;
}

function value_save(obj){ // obj라는 매개변수로 this값 받기
    var input_label = [ "행","열","너비","높이"];
    var T_put = document.getElementsByClassName("T_put");
    for(var i in T_put){
        if(T_put[i].value == ''){
            alert(input_label[i] +" 을 입력하세요");
            T_put[i].focus();
            return;
        }
    }

    var temp = new tb(T_put[0].value, T_put[1].value, T_put[2].value, T_put[3].value );
    tb_list.push(temp);

    obj.dataset.value = bt_cnt;

    bt_check = false;
    for(var i=0; i<T_put.length; i++){
        T_put[i].value = '';
    }
}










 
