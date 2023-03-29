package glasser_weather;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;

public interface WeatherService {
    @GET("/data/2.5/weather?q=Passaic&appid=e094cfb7fafdfad3caca826a86396bfa&units=imperial")
    Observable<CurrentWeather> getCurrentWeather();

}