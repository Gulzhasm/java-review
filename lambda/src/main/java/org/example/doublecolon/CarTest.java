package org.example.doublecolon;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {

        //Zero arg
        Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getModel());

        Supplier<Car> c2 = Car::new;
        System.out.println(c2.get().getMake());

        //One arg
       Function<Integer, Car> fn1 = Car::new;
       Car tesla = fn1.apply(2010);
        System.out.println(tesla.getModel());

        //Two arg
      BiFunction<String, Integer, Car> b1 = (model, make) -> new Car(model, make);
      Car honda = b1.apply("Honda", 2009);

        BiFunction<String, Integer, Car> b2 = Car::new;
        Car bmw = b1.apply("BMW", 2022);

    }
}
