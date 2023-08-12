package org.example.review;

import java.util.ArrayList;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {
//        Car car = Car.builder()
//                .make("Tesla")
//                .topSpeed(200)
//                .year(2020)
//                .build();
        //      System.out.println(car);


        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Toyota", 100, 2023));
        carList.add(new Car("Honda", 160, 2020));
        carList.add(new Car("Tesla", 200, 2023));
        carList.add(new Car("Audi", 200, 2008));
       // System.out.println(filterCars(carList, new CarFastPredicate()));


        //interface                = function
        CarPredicate fastPredicate = car -> car.getTopSpeed() > 160;
        System.out.println("Fast Cars");
        System.out.println(filterCars(carList, fastPredicate));

        System.out.println("New Cars");
        System.out.println(filterCars(carList, car -> car.getYear() > 2015));
    }

    private static List<Car> filterCars(List<Car> cars, CarPredicate predicate) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (predicate.test(car)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
}
