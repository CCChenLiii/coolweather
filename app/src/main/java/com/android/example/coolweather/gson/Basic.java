package com.android.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 果粒橙 on 2017.10.23.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
