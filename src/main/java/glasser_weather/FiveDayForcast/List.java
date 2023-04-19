
package glasser_weather.FiveDayForcast;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class List {

    @Expose
    private Clouds clouds;
    @Expose
    private Double dt;
    @SerializedName("dt_txt")
    private String dtTxt;
    @Expose
    private Main main;
    @Expose
    private Double pop;
    @Expose
    private Sys sys;
    @Expose
    private Double visibility;
    @Expose
    private java.util.List<Weather> weather;
    @Expose
    private Wind wind;


}
