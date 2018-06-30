$(document).ready(function(){
    $.ajax({
        url: "http://api.openweathermap.org/data/2.5/weather?q=" + "Faaa" +
            "&units=metric&APPID=e859adf4ab9ae89323535d40291e7ac1",
        type: "GET",
        dataType: "jsonp",
        success: function (data) {
            var cityName = data.name;
            var country = data.sys.country;
            var weather = data.weather[0].main;
            var description = data.weather[0].description;
            var temp = data.main.temp;
            var maxTemp = data.main.temp_max;
            var minTemp = data.main.temp_min;
            $("#tempreture").html("City: " + cityName + "</br>" +
                "Country: " + country + "</br>" +
                "Weather: " + weather + "</br>" +
                "Description: " + description + "</br>" +
                "Current temp: " + temp + "</br>" +
                "MaxTemp: " + maxTemp + "</br>" +
                "MinTemp: " + minTemp + "</br>"
            );
        },

    });  
})
