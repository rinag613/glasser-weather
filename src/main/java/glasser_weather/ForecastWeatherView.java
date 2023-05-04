package glasser_weather;

import glasser_weather.FiveDayForcast.FiveDayForcast;

import javax.swing.*;
import java.awt.*;

public class ForecastWeatherView extends JComponent {
    public FiveDayForcast fiveDayForcast;
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.translate(0, getHeight());

        if (fiveDayForcast != null) {
            for (int i = 1; i < fiveDayForcast.getList().length; i++) {
                g.drawLine((i-1) * 20,
                        -(int) (fiveDayForcast.getList()[i-1].getMain().getTemp() * 5),
                        (i*20),
                        -(int) (fiveDayForcast.getList()[i].getMain().getTemp() * 5));
            }

        }
        }
    }


    public void setFiveDayForecast(FiveDayForcast fiveDayForcast) {
        this.fiveDayForcast = fiveDayForcast;
        repaint();
    }

}
