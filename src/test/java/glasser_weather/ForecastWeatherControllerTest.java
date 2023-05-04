package glasser_weather;

import glasser_weather.FiveDayForcast.FiveDayForcast;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.schedulers.Schedulers;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class ForecastWeatherControllerTest {
    static{
        RxJavaPlugins.setIoSchedulerHandler(scheduler -> Schedulers.trampoline());
        RxJavaPlugins.setNewThreadSchedulerHandler(scheduler -> Schedulers.trampoline());
    }
    @Test
    void updateWeather(){
        //given
        WeatherService service = mock();
        ForecastWeatherView view = mock();
        ForecastWeatherController controller = new ForecastWeatherController(view, service);
        FiveDayForcast fiveDayForecast = mock();
        Observable<FiveDayForcast> observable = Observable.just(fiveDayForecast);
        doReturn(observable).when(service).getFiveDayForcast("New York");
        //when
        controller.updateWeather("New York");
        //then
        verify(service).getFiveDayForcast("New York");
        verify(view).setFiveDayForecast(fiveDayForecast);

    }
}
