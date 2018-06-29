var currentShow = $("#home");
$("#book-button").on("click", function () {
   currentShow.hide();
   $("#book-div").show();
   currentShow= $("#book-div");
})
