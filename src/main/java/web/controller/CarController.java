package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.Service;
import web.service.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping("cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count,
                          Model model) {
        Service service = new ServiceImpl();
        if (count == null || count > service.listCars().size()) {
            model.addAttribute("cars", service.listCars());
        } else {
            List<Car> cars = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                cars.add(service.listCars().get(i));
            }
            model.addAttribute("cars", cars);
        }
        System.out.println(count);


        return "cars";
    }


}
