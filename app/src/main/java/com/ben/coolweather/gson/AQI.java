package com.ben.coolweather.gson;

/**
 * Created by buta on 2018/1/16.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;

        public String pm25;
    }
}
