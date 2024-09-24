package com.example.weatherdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class weatherController {

    @Autowired
    private weatherDataRepository wweatherDataRepository;

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("weatherData", new weatherData());
        return "weather_form";
    }

    @PostMapping("/submit")
    public String submitWeatherData(@ModelAttribute weatherData weatherData, Model model) {
        wweatherDataRepository.save(weatherData);
        model.addAttribute("weatherData", weatherData);
        return "weather_result";
    }
}
