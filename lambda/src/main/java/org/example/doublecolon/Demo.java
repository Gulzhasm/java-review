package org.example.doublecolon;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Demo {
     public static void main(String[] args) {

          //Referencing to a static method
          //static method can be called as  Calculate:: findSum
          Calculate calculate1 = (x, y) -> Calculator.findSum(x,y);
          calculate1.calculate(10,20);

          Calculate calculate2 = Calculator::findSum;

          //Referencing to an instance method
          //instance method can be called as  Calculate:: findSum
          Calculate instance = (x,y) -> new Calculator().findMultiply(x,y);
          instance.calculate(10,20);

          Calculate instance1 = new Calculator()::findMultiply;
          instance1.calculate(10,20);

          //Referencing to Bi functional method

          BiFunction<String, Integer, String> fn = (str,i) -> str.substring(i);
          BiFunction<String, Integer, String> fn1 = String::substring;
          System.out.println(fn.apply("Developer", 7));
          System.out.println(fn1.apply("Developer", 7));

          Consumer<Integer> display = integer -> System.out.println(integer);
          display.accept(20);

          Consumer<Integer> display1 = System.out::println;
          display1.accept(20);
     }

}
