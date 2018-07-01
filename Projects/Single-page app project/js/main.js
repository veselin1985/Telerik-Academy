var currentShow = $("#home-div");
$("#book-button").on("click", function () {
    currentShow.hide();
    $("#book-div").show();
    currentShow = $("#book-div");
    $('body').css("background-image", "../img/bookingBG.jpg");
    $.backstretch("img/bookingBG.jpg");
})
$("#weather-button").on("click", function () {
    currentShow.hide();
    $("#weather-div").show();
    currentShow = $("#weather-div");
    $('body').css("background-image", "../img/weatherBG.jpg");
    $.backstretch("img/weatherBG.jpg");

})

$("#home-button").on("click", function () {
    currentShow.hide();
    $("#home-div").show();
    currentShow = $("#home-div");
    $('body').css("background-image", "../img/homeBG.jpg");
    $.backstretch("img/homeBG.jpg");
})
$.backstretch("img/homeBG.jpg");




