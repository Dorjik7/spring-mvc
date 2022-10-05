package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;


@Controller
public class CarController {

    private CarService service;
    private Car header;

    @Autowired
    public CarController(CarService service, Car header) {
        this.service = service;
        this.header = header;
    }

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count", required = false, defaultValue = "5") Integer count, ModelMap model) {
        model.addAttribute("cars", service.getCarCount(count.intValue()));
        model.addAttribute("header", header.getHeader());
        return "cars";
    }
}


