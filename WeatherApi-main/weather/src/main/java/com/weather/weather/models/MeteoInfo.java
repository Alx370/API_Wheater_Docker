package com.weather.weather.models;

public class MeteoInfo {

    private double temperaturaAttuale;
    private double temperaturaMin;
    private double temperaturaMax;

    public MeteoInfo(double temperaturaAttuale, double temperaturaMin, double temperaturaMax) {
        this.temperaturaAttuale = temperaturaAttuale;
        this.temperaturaMin = temperaturaMin;
        this.temperaturaMax = temperaturaMax;
    }

    public double getTemperaturaAttuale() {
        return temperaturaAttuale;
    }

    public double getTemperaturaMin() {
        return temperaturaMin;
    }

    public double getTemperaturaMax() {
        return temperaturaMax;
    }
}
