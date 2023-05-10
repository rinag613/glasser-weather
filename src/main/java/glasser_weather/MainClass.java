package glasser_weather;

import glasser_weather.ForecastWeatherComponent;

import glasser_weather.*;

public class MainClass {
    public static void main(String[] args) {
        ForecastWeatherComponent component = DaggerForecastWeatherComponent
                .builder()
                .build();
        ForecastWeatherFrame frame = component.providesForecastWeatherFrame();

    frame.setVisible(true);
    }
}
