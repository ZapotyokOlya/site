package by.itacademy.service;

import by.itacademy.dao.Car;

public class CarService {

    public int getAveragePrice() {
        return new Car().getAveragePrice();
    }
}
