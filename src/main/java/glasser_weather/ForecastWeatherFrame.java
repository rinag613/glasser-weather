package glasser_weather;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import javax.inject.Inject;
import javax.swing.*;
import java.awt.*;

public class ForecastWeatherFrame extends JFrame {

    private ForecastWeatherController controller;
    private Button submitButton;
    private ForecastWeatherView view;
    private JTextField location;
    private final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.openweathermap.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .build();
    private final WeatherService service = retrofit.create(WeatherService.class);

    @Inject
    public ForecastWeatherFrame (ForecastWeatherView view, ForecastWeatherController controller) {

        this.view = view;
        JPanel panel = new JPanel(new BorderLayout());
        JPanel panel1 = new JPanel(new BorderLayout());
        location = new JTextField("New York");
        setSize(900, 900);
        setTitle("5 Day Forecast");
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        panel1.add(location, BorderLayout.EAST);
        submitButton = new Button("Submit");

        panel1.add(submitButton, BorderLayout.WEST);
        panel.add(panel1,BorderLayout.NORTH);
        panel.add(view,BorderLayout.SOUTH);

        setContentPane(panel);


    this.controller = controller;
    submitButton.addActionListener(e -> controller.updateWeather(location.getText()));


    }
}
