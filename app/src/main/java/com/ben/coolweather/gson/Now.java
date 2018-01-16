package com.ben.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by buta on 2018/1/16.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}