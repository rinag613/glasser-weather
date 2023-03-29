package glasser_weather;

import org.junit.jupiter.api.Test;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import static org.junit.jupiter.api.Assertions.*;

class CurrentWeatherTest {
    @Test
    void getCurrentWeather() {
        //given
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.openweathermap.org/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .build();
        WeatherService weatherService = retrofit.create(WeatherService.class);
        //when
       CurrentWeather currentWeather =  weatherService.getCurrentWeather().blockingFirst();
       //then
        assertNotNull(currentWeather);
        assertNotNull(currentWeather.getWeather().get(0).getDescription());
        //this will fail when it gets below 0 outside
        assertTrue(currentWeather.getMain().getTemp()>0);
    }
}