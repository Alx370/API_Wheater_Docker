package com.weather.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.weather.weather.entities.Comuni;
import com.weather.weather.models.MeteoInfo;
import com.weather.weather.services.ComuniServiceImpl;
import com.weather.weather.services.MeteoInfoServiceImpl;


@Controller
public class WeatherController {

    @Autowired
    private ComuniServiceImpl comuniService;

    @Autowired
    private MeteoInfoServiceImpl meteoInfoService;

    @GetMapping("/")
    public String Home(Model model) {
        model.addAttribute("comuni", comuniService.getAllComuni());
        return "home";
    }

    
    @GetMapping("/weather")
    public String meteoPerComune(@RequestParam("comuneId") int comuneId, Model model) {
        Comuni comune = comuniService.getComuneById(comuneId);
        MeteoInfo meteo = meteoInfoService.getMeteo(comune.getLatitudine(), comune.getLongitudine());

        model.addAttribute("comuni", comuniService.getAllComuni());
        model.addAttribute("comune", comune);
        model.addAttribute("meteo", meteo);
        return "meteo"; // meteo.html
    }
    

}
