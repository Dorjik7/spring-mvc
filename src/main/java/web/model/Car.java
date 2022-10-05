package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {

    private String carModel;
    private String carColor;
    private int year;
    private static String getHeader = "Модель / " + ' ' + "Цвет / " + ' ' + "Год выпуска";

    public Car(String carModel, String carColor, int year) {
        this.carModel = carModel;
        this.carColor = carColor;

        this.year = year;
    }

    public Car() {
    }

    public String toStringFormatted() {
        return carModel + " / " + carColor + " / " + +year;
    }

    public String getHeader() {
        return getHeader;
    }
}

