package com.service.hydrometrics.models.DTO.weatherData;

import com.service.hydrometrics.models.DB.entity.WeatherData;
import com.service.hydrometrics.models.DTO.alert.StationDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.text.SimpleDateFormat;

@Getter
@AllArgsConstructor
public class WeatherDataDTO implements Serializable {

    private final String dateTime;
    private final double windSpeed;
    private final double windDirection;
    private final double precipitation;
    private final double temperature;
    private final double solarRadiation;
    private final double relativeHumidity;
    private final StationDTO station;

    public WeatherDataDTO(WeatherData weatherData) {
        this.dateTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(weatherData.getDateTime());
        this.windSpeed = weatherData.getWindSpeed();
        this.windDirection = weatherData.getWindDirection();
        this.precipitation = weatherData.getPrecipitation();
        this.temperature = weatherData.getTemperature();
        this.solarRadiation = weatherData.getSolarRadiation();
        this.relativeHumidity = weatherData.getRelativeHumidity();
        this.station = new StationDTO(weatherData.getStation().getId(), weatherData.getStation().getName());
    }
}