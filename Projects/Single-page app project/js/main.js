var currentShow = $("#home-div");
$("#book-button").on("click", function () {
    currentShow.hide();
    $("#book-div").show();
    currentShow = $("#book-div");
})
$("#weather-button").on("click", function () {
    currentShow.hide();
    $("#weather-div").show();
    currentShow = $("#weather-div");

})

$("#home-button").on("click", function () {
    currentShow.hide();
    $("#home-div").show();
    currentShow = $("#home-div");
})

$.backstretch("img/Bora-Bora-Pool-party_3840x2160.jpg");