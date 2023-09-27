package org.example.redo;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {
        List<Orange> orangeInventory = new ArrayList<>();
        orangeInventory.add(new Orange(300, Color.GREEN));
        orangeInventory.add(new Orange(100, Color.GREEN));
        orangeInventory.add(Orange.builder().weight(200).color(Color.RED).build());
        orangeInventory.add(Orange.builder().weight(500).color(Color.RED).build());


        OrangeFormatter simpleFormatter = orange -> "An orange of " + orange.getWeight();
        prettyPrintOrange(orangeInventory, simpleFormatter);

        prettyPrintOrange(orangeInventory,  orange ->"An orange of " + orange.getWeight());

        OrangeFormatter fancyFormatter = orange -> {
            String characteristic = orange.getWeight() > 150 ? "Heavy" : "Light";
            return  "A " + characteristic + "  " + orange.getColor() + " orange";
        };

        prettyPrintOrange(orangeInventory, fancyFormatter);
    }
















    private static void prettyPrintOrange(List<Orange> inventory, OrangeFormatter orangeFormatter){
        for(Orange orange: inventory){
            String output = orangeFormatter.accept(orange);
            System.out.println(output);
        }
    }
}
