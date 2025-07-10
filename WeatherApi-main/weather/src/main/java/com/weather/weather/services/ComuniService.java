package com.weather.weather.services;

import java.util.List;

import com.weather.weather.entities.Comuni;

public interface ComuniService {

    public List<Comuni> getAllComuni();

    public Comuni getComuneById(int id);

}
