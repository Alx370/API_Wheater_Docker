package com.weather.weather.services;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.weather.weather.models.MeteoInfo;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MeteoInfoServiceImpl implements MeteoInfoService{

    private final RestTemplate restTemplate = new RestTemplate();
    private final ObjectMapper objectMapper = new ObjectMapper();

    public MeteoInfo getMeteo(double latitudine, double longitudine) {
        String url = "https://api.open-meteo.com/v1/forecast?latitude=" + latitudine +
                "&longitude=" + longitudine +
                "&current=temperature_2m" +
                "&daily=temperature_2m_min,temperature_2m_max" +
                "&timezone=auto";

        try {
            String response = restTemplate.getForObject(url, String.class);
            JsonNode root = objectMapper.readTree(response);

            double temperaturaAttuale = root.path("current").path("temperature_2m").asDouble();
            double temperaturaMin = root.path("daily").path("temperature_2m_min").get(0).asDouble();
            double temperaturaMax = root.path("daily").path("temperature_2m_max").get(0).asDouble();

            return new MeteoInfo(temperaturaAttuale, temperaturaMin, temperaturaMax);
        } catch (Exception e) {
            throw new RuntimeException("Errore durante la chiamata a Open-Meteo API", e);
        }
    }
}
