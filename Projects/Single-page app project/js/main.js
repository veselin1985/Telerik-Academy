$.backstretch("img/homeBG.jpg");

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


$("#galery-button").on("click", function () {
    currentShow.hide();
    $("#galery-div").show();
    currentShow = $("#galery-div");
    $('body').css("background-image", "../img/galeryBG.jpg");
    $.backstretch("img/galeryBG.jpg");
})
$("#your-stay-button").on("click", function () {
    currentShow.hide();
    $("#your-stay-div").show();
    currentShow = $("#your-stay-div");
    $('body').css("background-image", "../img/your-stayBG3.jpg");
    $.backstretch("img/your-stayBG3.jpg");
})
