package com.example.insekar.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetData {

    @SerializedName("sembuh")
    @Expose
    private Integer sembuh;
    @SerializedName("meninggal")
    @Expose
    private Integer meninggal;
    @SerializedName("jumlahKasus")
    @Expose
    private Integer jumlahKasus;


    public Integer getSembuh() {
        return sembuh;
    }

    public void setSembuh(Integer sembuh) {
        this.sembuh = sembuh;
    }

    public Integer getMeninggal() {
        return meninggal;
    }

    public void setMeninggal(Integer meninggal) {
        this.meninggal = meninggal;
    }

    public Integer getJumlahKasus() {
        return jumlahKasus;
    }
}