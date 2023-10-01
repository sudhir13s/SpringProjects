package dev.ss.springprojects.weatherapi.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class weatherAPIController {


  @GetMapping("/")
  public String weatherWelcomeNote() {
    return "Welcome to weather API";
  }

  @GetMapping("/weather")
  public String getWeather() {
    return "weather data";
  }
}
