
package glasser_weather.FiveDayForcast;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Main {

    @SerializedName("feels_like")
    private Double feelsLike;
    @SerializedName("grnd_level")
    private Double grndLevel;
    @Expose
    private Double humidity;
    @Expose
    private Double pressure;
    @SerializedName("sea_level")
    private Double seaLevel;
    @Expose
    private Double temp;
    @SerializedName("temp_kf")
    private Double tempKf;
    @SerializedName("temp_max")
    private Double tempMax;
    @SerializedName("temp_min")
    private Double tempMin;


}
