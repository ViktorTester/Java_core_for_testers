package lessons.lesson_8;

import lesson_8.entity.WeatherData;
import lesson_8.enums.Periods;

import java.io.IOException;

public interface WeatherProvider {

    WeatherData getWeather(Periods periods) throws IOException;

    WeatherData getAllFromDb() throws IOException;
}