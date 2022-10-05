package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {
    private final List<Car> cars = new ArrayList<>();

    public CarDaoImpl() {
        cars.add(new Car("Запорожец", "желтый", 2020));
        cars.add(new Car("Москвич", "голубой", 2030));
        cars.add(new Car("Чайка", "черный", 2095));
        cars.add(new Car("Победа", "белый", 2024));
        cars.add(new Car("УАЗ", "хаки", 2023));
    }

    @Override
    public List<Car> carCount(int count) {
        List<Car> carList = cars;
        if (count <= 5) {
            carList = cars.stream().limit(count).collect(Collectors
                    .toCollection(ArrayList::new));
        }
        return carList;
    }
}
