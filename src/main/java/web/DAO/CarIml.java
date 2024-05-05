package web.DAO;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarIml implements CarDAO {
    public List<Car> listCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Tesla", 1, "black"));
        cars.add(new Car("audi", 2, "white"));
        cars.add(new Car("bmw", 3, "pink"));
        cars.add(new Car("lada", 24, "orange"));
        cars.add(new Car("Tesla", 2, "black"));
        return cars;
    }
}
