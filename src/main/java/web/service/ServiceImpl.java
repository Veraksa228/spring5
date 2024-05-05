package web.service;

import web.DAO.CarDAO;
import web.DAO.CarIml;
import web.model.Car;

import java.util.List;

public class ServiceImpl implements Service {
    private CarDAO carIml = new CarIml();

    @Override
    public List<Car> listCars() {
        return carIml.listCars();
    }
}
