
 var loadHomeBG = function(){
    $('body').css("background-image", "../img/homeBG.jpg");
 }

var currentShow = $("#home-div");
$("#book-button").on("click", function () {
    currentShow.hide();
    $("#book-div").show();
    currentShow = $("#book-div");
    $('body').css("background-image", "url('img/bookingBG.jpg')");
})
$("#weather-button").on("click", function () {
    currentShow.hide();
    $("#weather-div").show();
    currentShow = $("#weather-div");
    $('body').css("background-image", "url('img/weatherBG.jpg')");
})

$("#home-button").on("click", function () {
    currentShow.hide();
    $("#home-div").show();
    currentShow = $("#home-div");
    $('body').css("background-image", "url('img/homeBG.jpg')");
})


$("#galery-button").on("click", function () {
    currentShow.hide();
    $("#galery-div").show();
    currentShow = $("#galery-div");
    $('body').css("background-image", "url('img/galeryBG.jpg')");
})
$("#your-stay-button").on("click", function () {
    currentShow.hide();
    $("#your-stay-div").show();
    currentShow = $("#your-stay-div");
    $('body').css("background-image", "url('img/your-stayBG3.jpg')");
})
