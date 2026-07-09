package com.ayana.carService.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarDetailsController {

    @RequestMapping("/car")
    public String carDetails() {
        // Implement login logic here
        return "car successful for user: ";
    }
}
