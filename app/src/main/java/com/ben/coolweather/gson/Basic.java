package com.ben.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by buta on 2018/1/16.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
