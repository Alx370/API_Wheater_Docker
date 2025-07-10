package com.weather.weather.services;

import com.weather.weather.models.MeteoInfo;

public interface MeteoInfoService {
    
    public MeteoInfo getMeteo(double latitudine, double longitudine);

}
