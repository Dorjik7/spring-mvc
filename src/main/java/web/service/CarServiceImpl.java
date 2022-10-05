package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private CarDao dao;

    @Autowired
    public CarServiceImpl(CarDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Car> getCarCount(int count) {
        return dao.carCount(count);
    }

}
