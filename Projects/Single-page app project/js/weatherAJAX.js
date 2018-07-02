(() => {
    debugger;
    var setWeather = (data) => {
        var weather = data.weather[0].main;
        var description = data.weather[0].description;
        var icon = data.weather[0].icon;
        var temperature = data.main.temp;
        var clouds = data.clouds.all;
        var humidity = data.main.humidity;
        var wind = data.wind.speed;
        var pressure = data.main.pressure;
    
        $("#weather-description").html("Weather: " + weather + " - " + description);
        $("#weather-icon").attr("src", icon);
        $("#weather-temperature").html("Current tempreture: " + temperature +" &#8451");
        $("#weather-clouds").html("Clouds: " + clouds + "%");
        $("#weather-humidity").html("Humidity: " + humidity + "%");
        $("#weather-wind").html("Wind speed: "+ wind+" meter/sec");
        $("#weather-pressure").html("Pressure: "+ pressure+" hPa");
    
    }

    $.ajax({
        url: "http://api.openweathermap.org/data/2.5/weather?q=" + "Faaa" +
            "&units=metric&APPID=e859adf4ab9ae89323535d40291e7ac1",
        type: "GET",
        dataType: "jsonp",
        success: setWeather,
        error: () => {console.log('err')}

    });

})()