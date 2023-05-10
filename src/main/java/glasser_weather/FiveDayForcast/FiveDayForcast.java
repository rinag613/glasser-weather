
package glasser_weather.FiveDayForcast;

import com.google.gson.annotations.Expose;

import javax.annotation.processing.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class FiveDayForcast {

    @Expose
    private City city;
    @Expose
    private Double cnt;
    @Expose
    private String cod;
    @Expose
    private Double message;

    ThreeHourForecast list[];

    public ThreeHourForecast[] getList() {
        return list;
    }
}