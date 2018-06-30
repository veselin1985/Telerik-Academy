$(document).ready(function () {
    $.ajax({
        url: "http://api.openweathermap.org/data/2.5/weather?q=" + "Faaa" +
            "&units=metric&APPID=e859adf4ab9ae89323535d40291e7ac1",
        type: "GET",
        dataType: "jsonp",
        success: function (data) {
            console.log(data);
            var weather = data.weather[0].main;
            var description = data.weather[0].description;
            var icon = data.weather[0].icon;
            var tempreture = data.main.temp;
            var clouds = data.clouds.all;
            var humidity = data.main.humidity;
            var wind = data.wind.speed;
            var pressure = data.main.pressure;

            $("#weather-description").html("Weather: " + weather + " - " + description);
            $("#weather-icon").attr("src", icon);
            $("#weather-tempreture").html("Current tempreture: " + tempreture);
            $("#weather-clouds").html("Clouds: " + humidity + "%");
            $("#weather-humidity").html("Humidity: " + humidity + "%");
            $("#weather-wind").html("Wind speed: "+ wind+"meter/sec");
            $("#weather-pressure").html("Pressure: "+ pressure+"hPa");

        },

    });
})