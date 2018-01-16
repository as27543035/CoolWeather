package com.ben.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by buta on 2018/1/16.
 */

public class Province extends DataSupport {

    private int id;

    private String provinceName;

    private int provinecCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinecCode() {
        return provinecCode;
    }

    public void setProvinecCode(int provinecCode) {
        this.provinecCode = provinecCode;
    }
}
