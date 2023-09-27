package org.example.functional;

import java.util.Map;
import java.util.function.*;

public class Examples {
    public static void main(String[] args) {

        //PREDICATE
//        Predicate<Integer> lesserThan = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer > 18;
//            }
//        };
//        lesserThan.test(50);

        Predicate<Integer> lesserThan = x -> x < 18;
       // System.out.println(lesserThan.test(50));


      //CONSUMER
//        Consumer<Integer> display = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        };
        Consumer<Integer> display = System.out::println;
        display.accept(50);


        //BiConsumer
        BiConsumer<Integer, Integer> addTwo = (x,y) -> System.out.println(x+y);
        addTwo.accept(100,200);

        //FUNCTION
        Function<String, String> fun = s -> "Hello " + s;
        System.out.println(fun.apply("Gulzhas"));

        //SUPPLIER
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());
    }
}
