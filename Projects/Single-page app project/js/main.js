$.backstretch("img/homeBG.jpg");
var slider = true;
var currentShow = $("#home-div");
$("#book-button").on("click", function () {
    currentShow.hide();
    $("#book-div").show();
    currentShow = $("#book-div");
    $('body').css("background-image", "../img/bookingBG.jpg");
    $.backstretch("img/bookingBG.jpg");
    slider = false;
})
$("#weather-button").on("click", function () {
    currentShow.hide();
    $("#weather-div").show();
    currentShow = $("#weather-div");
    $('body').css("background-image", "../img/weatherBG.jpg");
    $.backstretch("img/weatherBG.jpg");
    slider = false;
})

$("#home-button").on("click", function () {
    currentShow.hide();
    $("#home-div").show();
    currentShow = $("#home-div");
    $('body').css("background-image", "../img/homeBG.jpg");
    $.backstretch("img/homeBG.jpg");
    slider = false;
})


$("#galery-button").on("click", function () {
    currentShow.hide();
    $("#galery-div").show();
    currentShow = $("#galery-div");
    $('body').css("background-image", "../img/galeryBG.jpg");
    $.backstretch("img/galeryBG.jpg");
    slider = true;
    $(function () {
        if (slider) {
            $(function () {
                var counter = 1;
                var imagNums = 3;
                $(".slides").children().first().addClass("top");
                var change = function () {

                    var current = $(".top");
                    var next = current.next();
                    if (counter === imagNums) {
                        current.removeClass("top");
                        next = $(".slides").children().first();
                        next.addClass("top")
                        counter = 0;

                    } else {
                        current.removeClass("top");
                        next.addClass("top");
                        counter += 1;
                    }
                }
                setInterval(change, 2000);
            })
        }
    })
})