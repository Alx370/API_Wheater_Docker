package com.weather.weather.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weather.weather.entities.Comuni;
import com.weather.weather.repositories.ComuniRepo;

@Service
public class ComuniServiceImpl implements ComuniService{

    @Autowired
    private ComuniRepo comuniRepo;

    @Override
    public List<Comuni> getAllComuni(){

        return comuniRepo.findAll();

    }

    @Override
    public Comuni getComuneById(int id){

        return comuniRepo.findById(id).orElseThrow();

    }

}
