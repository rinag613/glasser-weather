package glasser_weather;

import io.reactivex.rxjava3.schedulers.Schedulers;

public class ForecastWeatherController {
    private ForecastWeatherView view;
    private WeatherService service;

    public ForecastWeatherController(
            ForecastWeatherView view,
            WeatherService service
    ) {
        this.view = view;
        this.service = service;
    }

    public void updateWeather(String location){
        service.getFiveDayForcast(location)
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.newThread())
                .subscribe(view::setFiveDayForecast,
                        Throwable::printStackTrace);
    }



}
