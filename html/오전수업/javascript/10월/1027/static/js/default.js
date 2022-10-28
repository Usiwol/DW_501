$(document).ready(function () {
  $('.menu-toggle').on('click', function () {
    $('.gnb').stop().slideToggle('fast');
  });
});

/*
시간설정 가능, fast, slow
show();
hide();
toggle();
fadein();  - 화면에 보여지는 것(투명도)
fadeout(); - 화면에서 안보여지는 것(투명도)
slideup();
slidedown();
slideToggle();
*/
