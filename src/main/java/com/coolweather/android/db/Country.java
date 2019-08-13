package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;

public class Country extends LitePalSupport {
    private int id;
    private String countryName;
    private int weathweId;
    private int cityid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getWeathweId() {
        return weathweId;
    }

    public void setWeathweId(int weathweId) {
        this.weathweId = weathweId;
    }

    public int getCityid() {
        return cityid;
    }

    public void setCityid(int cityid) {
        this.cityid = cityid;
    }
}
