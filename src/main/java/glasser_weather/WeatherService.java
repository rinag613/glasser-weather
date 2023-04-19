package glasser_weather;

import glasser_weather.FiveDayForcast.FiveDayForcast;
import glasser_weather.currentWeather.CurrentWeather;
import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {
    @GET("/data/2.5/weather?&appid=e094cfb7fafdfad3caca826a86396bfa&units=imperial")
    Observable<CurrentWeather> getCurrentWeather(@Query("q") String location);
    @GET("data/2.5/forecast?q=Passaic&appid=e094cfb7fafdfad3caca826a86396bfa&units=imperial")
    Observable<FiveDayForcast> getFiveDayForcast(@Query("q") String location);

}