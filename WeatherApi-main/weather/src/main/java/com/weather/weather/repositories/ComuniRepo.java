package com.weather.weather.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weather.weather.entities.Comuni;

@Repository
public interface ComuniRepo extends JpaRepository<Comuni,Integer>{

}
